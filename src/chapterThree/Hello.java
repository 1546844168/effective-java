package chapterThree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 江峰
 * @create 2018-10-14 16:44
 */



class Final {
    // 虽然被final修饰了，但是访问权限是public，所以这个类并不是安全的。
    public final int[] arr = {1, 2, 3};

    public static void main(String[] args) {
        Final f = new Final();
        f.arr[0] = 6;// final域被修改了
        System.out.println(Arrays.toString(f.arr));
    }
}
// 解决方案如下：使共有数组变成私有的，并增加一个公有的不可变列表。
class A {
    private final String[] arr = {};
    public final List<String> list = Collections.unmodifiableList(Arrays.asList(arr));
}

