package chapterTwo.Test;

/**
 * @author 江峰
 * @create 2018-10-13 21:01
 */

class A {
    private String name = "jf";

    private void print() {
        System.out.println(this.name);
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        String str = "zhagnsan";
        String str1 = str;
        str1 = "lisi";
        System.out.println(str);
        System.out.println(str1);


    }
}
