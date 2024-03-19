package ch01;

public class MidExam {
    public static int midFind (int a, int b, int c) {
        int mid = a;
        int max = a;
        int min = a;

        int[] arr = {a, b, c};
        for (int x: arr) {
            if (max < x)
                max = x;
            if (min > x)
                min = x;
        }
        for (int y: arr) {
            if (y != max && y!= min)
                mid = y;
        }
        return mid;
    }
}
