package chapterFour.ImmutableClass;

/**
 * @author 江峰
 * @create 2018-10-14 22:16
 * <p>
 * 不可变类
 * 方案一：fina修饰
 */
// 子类不能继承
public final class A {
    // final修饰，一经初始化就不会被改变。
    private final String name;
    private final int age;

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
