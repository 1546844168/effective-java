package chapterFour.functionObject;

import java.util.Arrays;

/**
 * @author 江峰
 * @create 2018-10-15 21:49
 */

public class StringLengthComparator {
    private StringLengthComparator() {
    }

    public static final StringLengthComparator instance = new StringLengthComparator();

    // 既然这个类只有一个方法，是用于比较字符串长度的，那么就不需要创建这个类的对象。所以私有化
    public int compare(String str1, String str2) {
        return str1.length() - str2.length();
    }

    public static void main(String[] args) {
        int compare = StringLengthComparator.instance.compare("namsse", "hahaa");
        System.out.println(compare);
    }
}
