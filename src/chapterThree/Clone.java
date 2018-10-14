package chapterThree;

/**
 * @author 江峰
 * @create 2018-10-14 14:53
 */
public class Clone implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Clone clone = (Clone) super.clone();
        return clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Clone clone = new Clone();
        System.out.println(clone.hashCode());
        Object clone1 = clone.clone();
        System.out.println(clone1.hashCode());
        System.out.println(clone == clone1);

    }

}
