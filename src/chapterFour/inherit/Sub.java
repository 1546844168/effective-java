package chapterFour.inherit;

import java.util.Date;

/**
 * @author 江峰
 * @create 2018-10-15 15:59
 */
public class Sub extends Super {
    private final Date date;

    public Sub() {
        date = new Date();
    }

    @Override
    public void hello() {
        System.out.println(date);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.hello();
    }
}
