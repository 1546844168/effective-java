package chapterSeven.varargs;

import java.util.Arrays;

/**
 * @author 江峰
 * @create 2019-11-20   10:05
 */
public class A {
    public static void main(String[] args) {
        fun();
        fun(1);
    }

    static void fun() {
        System.out.println("fun()");
    }

    static void fun(int... is) {
        System.out.println(Arrays.toString(is));
        System.out.println("fun ...");
    }
}
