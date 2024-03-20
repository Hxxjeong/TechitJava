package ch02;

public class PrimeTest {
    public static void main(String[] args) {
        // 1000 이하의 소수 찾기
        for (int i=2; i<= 1000; i++) {
            boolean isPrime = true;
            for(int j=2; j<i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
