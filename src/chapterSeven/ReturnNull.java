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
        // 写出健壮性的代码，需要对入参的参数进行判断，养成一个好习惯。
        if (arr == null) {
            return null;
        }
        if (arr.length == 0) {
            return arr;
        }
        return arr;
    }
}
