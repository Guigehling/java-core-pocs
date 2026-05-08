import java.util.Map;
import java.util.Properties;

public final class SystemProperties {

    private SystemProperties() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void create(final Map<String, String> map) {
        Properties properties = new Properties();
        properties.putAll(map);

        System.setProperties(properties);
    }

    public static void read(final String key) {
        System.out.println(key + ": " + System.getProperty(key));
    }

}
