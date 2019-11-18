package chapterFour.myInterface;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 江峰
 * @create 2019-11-15   13:59
 */
public class MyInterface {

    static List<Integer> intArrayAsList(final int[] a) {
        if (a == null) {
            throw new NullPointerException();
        }
        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return a[index];
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> integers = intArrayAsList(arr);
        System.out.println(integers);
        System.out.println(integers.size());
    }
}
