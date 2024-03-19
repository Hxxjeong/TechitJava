package ch01;

public class PenValue {
    public static void main(String[] args) {
        // Pen이라는 객체 2개가 만들어짐
        Pen pen = new Pen();
        Pen pen2 = new Pen();

        pen.제조사 = "hi";
        pen2.제조사 = "helo";

        // static field는 인스턴스가 생성될 때 같이 생성
        Pen.색깔 = "hihi";
        Pen.색깔 = "hahalo";

        System.out.println(pen.제조사);
        System.out.println(pen2.제조사);
        System.out.println(Pen.색깔);
        System.out.println(Pen.색깔);
    }
}
