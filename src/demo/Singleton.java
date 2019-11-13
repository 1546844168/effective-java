package demo;

/**
 * @author 江峰
 * @create 2019-11-12   17:09
 */

class A {

}

public class Singleton {
    private static final A a = new A();

    private Singleton() {

    }

    public static A getA() {
        return a;
    }

    public static void main(String[] args) {
        A a1 = Singleton.getA();
        A a2 = Singleton.getA();
        System.out.println(a1 == a2);
    }
}
