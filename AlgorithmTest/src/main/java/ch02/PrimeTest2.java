package ch02;

public class PrimeTest2 {
    public static void main(String[] args) {
        // 2를 배열에 저장시키고 홀수만 판단하여 1000 이하의 소수 찾기
        int primeCount = 0;     // 찾은 소수의 개수
        int[] prime = new int[500];
        prime[primeCount++] = 2;    // 첫번째 소수

        for (int i=3; i<=1000; i+=2) {
            int j;
            for (j=1; j<primeCount; j++) {
                if (i % prime[j] == 0) {
                    break;
                }
            }
            if (primeCount == j) {
                prime[primeCount++] = i;
            }
        }

        for (int k: prime)
            System.out.println(k);
    }
}
