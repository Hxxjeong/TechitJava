package com.example.day09;

public class Network {
    private static int totalMessage = 0;

    public static class Message {
        private String content;

        public Message(String content) {
            this.content = content;
            totalMessage++;
        }

        public void send() {
            System.out.println("Send message: " + content);
            System.out.println("Total message: " + totalMessage);
        }
    }

    public static int getTotalMessage() {
        return totalMessage;
    }

    public static void main(String[] args) {
        Network.Message msg1 = new Network.Message("hi");
        Network.Message msg2 = new Network.Message("hello");

        msg1.send();
        msg2.send();

        System.out.println("Total Message: " + Network.getTotalMessage());
    }
}
