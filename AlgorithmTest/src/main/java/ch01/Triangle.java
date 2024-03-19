package ch01;

import java.util.Scanner;

public class Triangle {
    static void drawTriangle(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("출력할 행의 개수: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        drawTriangle(n);
    }
}
