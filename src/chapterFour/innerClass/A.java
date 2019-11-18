package chapterFour.innerClass;

import java.util.HashMap;
import java.util.Set;

/**
 * @author 江峰
 * @create 2018-10-16 12:34
 */
class A {
    private String name = "林加铭";
    private B b = new B();

    public void fun() {
        System.out.println("out");
        b.inner();
    }

    public B returnB() {
        B b = new B();
        return b;
    }

    class B {
        public void inner() {
            // fun(); // 非静态成员类内部方法可以直接调用外围内的方法。
            System.out.println("inner");
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
//      new A().new B().inner();
        new A().fun(); //

        HashMap hashMap = new HashMap();
        final Set set = hashMap.keySet();
    }
}
