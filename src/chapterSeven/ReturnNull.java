package chapterSeven;

import java.util.Arrays;

/**
 * @author 潇潇暮雨
 * @create 2018-10-21   9:52
 */
public class ReturnNull {
    public static void main(String[] args) {
        int[] arr = {};
        int[] fun = fun(null);
        System.out.println(Arrays.toString(fun));

    }

    public static int[] fun(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        return arr;
    }
}
