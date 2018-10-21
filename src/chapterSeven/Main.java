package chapterSeven;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 江峰
 * @create 2018-10-18 22:09
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(7);
        list.add(5);
        System.out.println(list);
        for (int i = 0; i < 2; i++) {
            list.remove(i);
        }
        System.out.println(list);
    }
}
