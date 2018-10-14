package chapterFour.ImmutableClass;

/**
 * @author 江峰
 * @create 2018-10-14 22:22
 * <p>
 * 不可变类
 * 方案二：使用private修饰所有的构造器
 */

public class B {
    private final String name;
    private final int age;

    // 子类不能继承，自身不能new一个对象。需提供一个方法创建对象。
    private B(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static B newInstance(String name, int age) {
        return new B(name, age);
    }
}
