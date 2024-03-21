package ch05;

public class FactorialTest {
    static int factorial(int n) {
        if (n > 0)
            return n * factorial(n-1);
        else
            return 1;
    }

    static int factorial2 (int n) {
        int fac = 1;
        for (int i=1; i<=n; i++)
            fac *= i;
        return fac;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial2(5));
    }
}
