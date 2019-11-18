package chapterFive;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 江峰
 * @create 2019-11-18   20:53
 * @Description 无限制通配符
 */
public class UnrestrictedWildcard {

    static int numElementsInCommon(Set s1, Set s2) {
        int count = 0;
        for (Object o : s1) {
            if (s2.contains(o)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet();
        Integer[] i1 = {1, 2, 3};
        Integer[] i2 = {1, 2, 3};

        Integer[] i3 = new Integer[i1.length];
        // System.arraycopy(i1, 0, i3, 0, i1.length);
        // System.out.println(Arrays.toString(i3));
        String[] s1 = {"a", "b"};
        int count = UnrestrictedWildcard.numElementsInCommon(new HashSet(Arrays.asList(i1)), new HashSet(Arrays.asList(s1)));
        System.out.println(count);
    }

}
