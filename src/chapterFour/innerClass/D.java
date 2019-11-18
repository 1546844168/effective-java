package chapterFour.innerClass;

/**
 * @author 江峰
 * @create 2019-11-18   14:51
 */
public class D {
    private static int i = 9;
    private String name = "江峰";
    E e = new E();

    public void gun() {
        System.out.println("gun()");
    }

    private static class E {
        public void fun() {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new D.E().fun();
        D d = new D();
        d.e.fun();
    }
}
