package chapterSeven;

/**
 * @author 江峰
 * @create 2019-11-19   21:40
 */
public class TestAssert {
    public static void main(String[] args) {
        TestAssert testAssert = new TestAssert();
        testAssert.get(4);
        testAssert.get(null);
    }

    public void get(Integer i) {
        assert i != null: "i 不能为空";
        System.out.println("helloworld");
    }
}
