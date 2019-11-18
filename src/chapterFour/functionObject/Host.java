package chapterFour.functionObject;

import java.io.Serializable;
import java.util.Comparator;

/**
 * @author 江峰
 * @create 2019-11-16   14:20
 */
public class Host {
    public static final Comparator STRING_LENGTH_COMPARATOR = new StrLenCmp();

    private static class StrLenCmp implements Comparator<String>, Serializable {
        private static final long serialVersionUID = 857579980893302988L;

        @Override
        public int compare(String o1, String o2) {
            return Integer.compare(o1.length(), o2.length());
        }
    }

    public static void main(String[] args) {
        int compare = Host.STRING_LENGTH_COMPARATOR.compare("abc", "abcd");
        System.out.println(compare);
    }
}
