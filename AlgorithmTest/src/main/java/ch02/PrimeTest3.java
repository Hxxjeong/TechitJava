package ch02;

public class PrimeTest3 {
    public static void main(String[] args) {
        // 2와 3을 넣어놓고 1000 이하의 소수 찾기
        int primeCount = 0;
        int[] prime = new int[500];
        prime[primeCount++] = 2;
        prime[primeCount++] = 3;

        for(int num=5; num<=1000; num+=2) {
            int i;
            for (i=1; i<primeCount; i++) {
                if (num % i == 0)
                    break;
            }
            if (primeCount == i)
                prime[primeCount++] = num;
        }

        for (int i: prime) {
            System.out.println(i);
        }
    }
}
