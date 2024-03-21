package ch05;

public class MethodTest {
    static void a() {
        b();
        System.out.println("a");
        System.out.println("a end!!");
    }

    static void b() {
        c();
        System.out.println("b");
        System.out.println("b end!!");
    }

    static void c() {
        d();
        System.out.println("c");
        System.out.println("c end!!");
    }

    static void d() {
        System.out.println("d");
        System.out.println("d end!!");
    }
}
