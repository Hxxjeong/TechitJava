package ch05;

public class GCDTest {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else {
            return gcd(b, a%b);
        }
    }

    static int gcd2 (int a, int b) {
        while (b != 0) {
            int tmp = b;
            b %= a;
            a = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(40, 60));
        System.out.println(gcd2(40, 60));
    }
}
