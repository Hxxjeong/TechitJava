package ch04;

public class MyQueue {
    private int head;
    private int rear;
    private int maxSize;
    private int[] queueArray;
    private int count;  // 큐에 저장된 데이터 수

    public MyQueue(int maxSize) {
        this.head = 0;
        this.rear = 0;
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
        this.count = 0;
    }

    // 큐에 요소 추가
    public void enqueue(int n) {
        if (count == maxSize) {
            System.out.println("Queue is full.");
        }
        else {
            queueArray[rear] = n;
//            rear++ // 선형 큐일 떄
            rear = (rear+1) % maxSize;
            count++;
        }
    }

    // 큐의 요소 제거 후 반환
    public int dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return -1;
        }
        else {
            int item = queueArray[head];
//            head++;   // 선형 큐일 때
            head = (head+1) % maxSize;
            count--;
            return item;
        }
    }

    // 큐의 제일 앞 요소 반환
    public int peek() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return -1;
        }
        else {
            return queueArray[head];
        }
    }

    // 큐가 비었는지 확인
    public boolean isEmpty() {
        return count == 0;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);

        queue.enqueue(1);
        queue.enqueue(2);

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}
