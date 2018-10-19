package chapterFive.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 江峰
 * @create 2018-10-16 22:58
 */
public class GenericBetterThanArray {
    public void generic(){
        List<Integer> list = new ArrayList<>();
//        list.add("hello"); // 会报错
    }

    public void array(){
        Object[] arr = new Long[1];
        arr[0] = "hello"; // 不报错
    }

}
