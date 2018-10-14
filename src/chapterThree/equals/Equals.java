package chapterThree.equals;

import java.util.Objects;

/**
 * @author 江峰
 * @create 2018-10-13 22:34
 */
public class Equals {
    private String name;
    private int age;

    public Equals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 参数是否为这个对象的引用
        if (!(o instanceof Equals)) return false; // 检查参数是否为正确的类型
        Equals equals = (Equals) o; // 类型转换
        return age == equals.age &&
                Objects.equals(name, equals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Equals e = new Equals("江峰", 21);
        System.out.println(27399557);
        System.out.println(e.hashCode());
    }
}
