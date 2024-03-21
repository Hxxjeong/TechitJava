package ch04;

public class MyStack {
    private int maxSize;    // 스택 최대 길이
    private int[] stackArray;   // 스택 데이터를 저장할 배열
    private int top;    // 스택의 최상위

    public MyStack(int stackSize) {
        this.maxSize = stackSize;
        this.stackArray = new int[stackSize];
        this.top = -1;
    }

    // 스택에 요소 추가
    public void push(int n) {
        if (!isFull())    // 스택이 가득 찼는지 확인
            stackArray[++top] = n;
        else
            System.out.println("Stack is full.");
    }

    // 스택의 가장 위에 있는 요소 제거 후 반환
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        else
            return stackArray[top--];
    }

    // 스택의 가장 위의 요소 반환
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        else
            return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // 스택이 가득 찼는지 확인
    public boolean isFull() {
        return top == maxSize-1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
    }
}
