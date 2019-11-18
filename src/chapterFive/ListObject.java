package chapterFive;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 江峰
 * @create 2019-11-18   20:43
 */
public class ListObject {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        ListObject listObject = new ListObject();
        listObject.unsafeAdd(strings, new Integer(23));
        System.out.println(strings.get(0));
    }

    public void unsafeAdd(List list, Object o) {
        list.add(o);
    }
}
