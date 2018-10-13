package ChapterTwo;

/**
 * @author 江峰
 * @create 2018-10-13 16:31
 */
public class Build {
    public static int num = 0;
    public final int id = ++num;

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        System.out.println(new Build().id);
        System.out.println(new Build().id);
        System.out.println(new Build().id);
        Build build = Build.class.newInstance();
        System.out.println(build.id);
        

    }
}
