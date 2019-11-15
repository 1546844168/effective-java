package chapterFour;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

/**
 * @author 江峰
 * @create 2019-11-14   22:02
 */
public class MyProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("H:\\code\\IntelliJ-IDEA\\effective-java\\src\\chapterFour\\person.properties"));
        Object name = properties.get("name");
        System.out.println(name);
        System.out.println(properties.get("age"));
    }
}
