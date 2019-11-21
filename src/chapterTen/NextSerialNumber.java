package chapterTen;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author 江峰
 * @create 2019-11-21   11:26
 */
public class NextSerialNumber {
    private static final AtomicLong nextSerialNumber = new AtomicLong();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getNextSerialNumber());
        }
    }

    public static long getNextSerialNumber() {
        return nextSerialNumber.getAndIncrement();
    }
}
