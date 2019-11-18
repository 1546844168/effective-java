package chapterFour;

import chapterFour.functionObject.Host;

/**
 * @author 江峰
 * @create 2019-11-16   14:28
 */
public class test {
    public static void main(String[] args) {
        int compare = Host.STRING_LENGTH_COMPARATOR.compare("abc", "abcd");
        System.out.println(compare);
    }
}
