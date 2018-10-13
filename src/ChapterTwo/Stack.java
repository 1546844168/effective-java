package ChapterTwo;

import java.util.Arrays;

/**
 * 这个类是有问题的，可能会发生内存泄漏
 *
 * @author 江峰
 * @create 2018-10-13 21:07
 * <p>
 * 栈
 */
public class Stack {
    // 栈的实际长度
    private int size = 0;
    // 存储元素
    private Object[] table = null;
    // 设置为static,可以提高性能，因为所有的Stack的默认初始化大小都是一样的。
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        // 对
        table = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    /**
     * 进栈
     */
    public void push(Object o) {
        ensureCapacity();
        table[size++] = o;
    }

    public Object pop() {
        // 没有进行垃圾回收，可能会引发内存泄漏
        // return table[--size];
        // 解决如下
        Object o = table[--size];
        table[size] = null; // 消除过期的引用
        return o;

    }

    public void ensureCapacity() {
        if (size == table.length) {
            Arrays.copyOf(table, 2 * size + 1);
        }

    }
}
