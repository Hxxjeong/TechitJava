package ch02;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 29;
        
        // 이진수로 변환했을 떄 담을 공간
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            decimal /= 2;
            binary.append(remainder);
        }
        System.out.println(binary.reverse());
    }
}
