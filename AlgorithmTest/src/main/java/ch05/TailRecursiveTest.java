package ch05;

public class TailRecursiveTest {
    // 꼬리 재귀 팩토리얼
    static int factorial(int n, int init) {
        if (n==1) return init;
        return factorial(n-1, n*init);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5, 1));
    }
}
