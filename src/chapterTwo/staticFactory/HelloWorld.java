package chapterTwo.staticFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法的使用
 *
 * @author 江峰
 * @create 2018-10-13 14:00
 */
interface Service {

}

interface Provider {
    Service newService();
}

public class HelloWorld {

    private static final Map<String, Provider> map = new HashMap<>();
    private static final String DEFAULT_PROVIDER_NAME = "defaultProvider";

    public static void registerDefaultApi(Provider p) {
        registerApi(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerApi(String name, Provider p) {
        map.put(DEFAULT_PROVIDER_NAME, p);
    }

    // 每次都是从map中直接获取，没有生成对象。
    public Service newInstance() {
        Provider provider = map.get(DEFAULT_PROVIDER_NAME);
        return provider.newService();
    }

    public Service newInstance(String name) {
        Provider provider = map.get(name);
        if (provider == null) {
            throw new IllegalArgumentException("no provider registered with  name: " + name);
        }
        return provider.newService();
    }
}
