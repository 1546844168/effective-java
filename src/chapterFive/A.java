package chapterFive;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 江峰
 * @create 2018-10-16 20:48
 */
public class A {
    public static void main(String[] args) {
        ArrayList<A> arrayList = new ArrayList<>();
        arrayList.add(new A());
        arrayList.add(new A());
        arrayList.add(new A());
    }
}

class B {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


    }

    public static void fun(List<Object> list) {

    }
}
