package chapterTwo;

/**
 * 要优先考虑使用基本类型而不是包装类，要当心无意识的自动装箱。两者性能上差异巨大。
 *
 * @author 江峰
 * @create 2018-10-13 20:26
 */
public class WasteObject {
    public static void main(String[] args) {
//        Long sum = 0L;
        long sum = 0L;
        long start = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(sum);
        System.out.println(end - start);
    }
}
