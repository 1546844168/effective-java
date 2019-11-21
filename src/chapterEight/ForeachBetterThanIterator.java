package chapterEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author 江峰
 * @create 2019-11-20   14:16
 */


enum Suit {
    CLUB,
    DIAMOND,
    HEART,
    SPADE
}

public class ForeachBetterThanIterator {
    public static void main(String[] args) {
        List<Suit> suits = new ArrayList<>(Arrays.asList(Suit.values()));
        Iterator<Suit> iterator = suits.iterator();

        while (iterator.hasNext()) {
            Suit next = iterator.next();
            if (next.equals(Suit.DIAMOND)) {
                iterator.remove(); // 删除元素
            }
        }

        for (Suit suit : suits) {
            System.out.println(suit);
        }
    }
}
