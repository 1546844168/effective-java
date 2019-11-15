package chapterThree;

/**
 * @author 江峰
 * @create 2018-10-14 14:53
 */
public class Clone implements Cloneable {
    private String name;

    public Clone(String name) {
        this.name = name;
    }

    @Override
    protected Clone clone() throws CloneNotSupportedException {
        return (Clone) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Clone clone = new Clone("江峰");
        System.out.println(clone.hashCode());
        Clone clone1 = clone.clone();
        System.out.println(clone1.hashCode());
        System.out.println(clone == clone1);
        System.out.println("clone1.name = " + clone1.getName());
    }

}
