package chapterFive.generic;

import java.util.Arrays;

/**
 * @author 江峰
 * @create 2018-10-18 13:23
 */
class Stack1 {

    private int size;
    private Object[] table;
    private final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack1() {
        table = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object o) {
        ensureCapacity();
        table[size] = o;
    }

    public Object pop() {
        if (size == 0) {
            throw new NullPointerException();
        }
        Object oldElements = table[--size];
        table[size] = null;
        return oldElements;
    }

    /**
     * 进行扩容
     */
    private void ensureCapacity() {
        if (size == table.length) {
            table = Arrays.copyOf(table, 2 * size + 1);
        }
    }
}
class Stack2<E> {

    private int size;
    private E[] table;
    private final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack2() {
        table = (E[])new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E o) {
        ensureCapacity();
        table[size] = o;
    }

    public E pop() {
        if (size == 0) {
            throw new NullPointerException();
        }
        E oldElements = table[--size];
        table[size] = null;
        return oldElements;
    }

    /**
     * 进行扩容
     */
    private void ensureCapacity() {
        if (size == table.length) {
            table = Arrays.copyOf(table, 2 * size + 1);
        }
    }
}
