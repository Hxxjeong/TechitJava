package ch01;

public class MaxValue {
    public static int max(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c)
            max = c;
        return max;
    }
}
