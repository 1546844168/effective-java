package chapterNine;

/**
 * @author 江峰
 * @create 2019-11-20   16:31
 */
public class A {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException("越界了");
        } catch (ArrayIndexOutOfBoundsException a) {
            a.printStackTrace();
        }
    }

}
