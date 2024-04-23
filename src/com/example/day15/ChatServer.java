package com.example.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ChatServer {
    public static void main(String[] args) {
        // 1. ServerSocket 생성
        try (ServerSocket serverSocket = new ServerSocket(9999);) {
            System.out.println("Ready Server.");

            // 여러 클라이언트의 정보를 넣을 자료구조
            Map<String, PrintWriter> clients = new HashMap<>();

            // 2. accept()를 통해 클라이언트를 기다림   (여러 명의 클라이언트와 통신)
            while (true) {
                Socket clientSocket = serverSocket.accept();

                // Thread 이용
                new ChatThread(clientSocket, clients).start();
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ChatThread extends Thread {
    // 생성자를 통해 클라이언트 소켓을 얻어옴
    private Socket socket;
    private String id;  // 클라이언트를 구분할 id
    private Map<String, PrintWriter> clients;

    private BufferedReader br;   // 생성자와 run()에서 사용하기 위함
    private PrintWriter pw;

    public ChatThread(Socket socket, Map<String, PrintWriter> clients) {
        this.socket = socket;
        this.clients = clients;

        // 클라이언트가 생성될 때 클라이언트로부터 id 얻기
        // 각 클라이언트와 통신할 수 있는 통로를 얻어옴
        try {
            pw = new PrintWriter(socket.getOutputStream(), true);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            id = br.readLine(); // 클라이언트가 접속하면 id 설정

            // 모든 사용자에게 id가 입장했다는 정보 알림
            broadcast(id + "님이 입장하셨습니다.");
            System.out.println("New Member's id: " + id);

            // 동시에 입장하는 경우 고려
            synchronized (clients) {
                clients.put(this.id, pw);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    // 연결된 클라이언트가 메시지를 전송하면 다른 클라이언트들에게 메시지 전송
    @Override
    public void run() {
        String msg;
        try {
            while ((msg = br.readLine()) != null) {
                if("/quit".equalsIgnoreCase(msg))
                    break;
                
                // @id 메시지 형식
                if (msg.indexOf("@") == 0)
                    toSomeone(msg);
                else
                    broadcast(id + " : " + msg);
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
        finally {
            // 동시에 퇴장하는 경우 고려
            synchronized (clients) {
                clients.remove(id);
            }
            broadcast(id + "님이 나갔습니다.");

            // 사용 후 BufferedReader와 Socket 닫기
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if(socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    // 모든 클라이언트에게 전송
    // 전체 사용자에게 알려주는 메소드 (Broadcast)
    public void broadcast(String msg) {
/*        for(PrintWriter writer: clients.values()) {
            writer.println(msg);
        }*/

        /*
        키 값으로 전송하는 경우
        for(String id: clients.keySet()) {
            clients.get(id).println(msg);
        }
         */
        
        // Iterator를 사용하는 경우
        synchronized (clients) {
            Iterator<PrintWriter> iterator = clients.values().iterator();
            while(iterator.hasNext()) {
                PrintWriter pw = iterator.next();
                try {
                    pw.println(msg);
                }
                catch (Exception e) {
                    iterator.remove();  // Broadcast 할 수 없는 사용자 제거
                    e.printStackTrace();
                }
            }
        }
    }

    // 메시지를 특정 사용자에게 전송
    public void toSomeone(String msg) {
        int firstSpaceIndex = msg.indexOf(" "); // 첫번째 공백의 인덱스
//        int secondSpaceIndex = msg.indexOf(" ", firstSpaceIndex + 1);

//        String targetId = msg.substring(firstSpaceIndex + 1, secondSpaceIndex);
//        String message = msg.substring(secondSpaceIndex + 1);

        String targetId = msg.substring(1, firstSpaceIndex);
        String message = msg.substring(firstSpaceIndex+1);

        //to(수신자)에게 메시지 전송.
        PrintWriter pw = clients.get(targetId);
        if (pw != null) {
            pw.println(id + "님의 귓속말: " + message);
        } else {
            pw.println(targetId + " 님을 찾을 수 없습니다.");
        }
    }
}
