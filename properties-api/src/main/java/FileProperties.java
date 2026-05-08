import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Properties;

public final class FileProperties {

    private static final String FILE_NAME = "app.properties";

    private FileProperties() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static Properties create(final Map<String, String> map) {
        Properties props = new Properties();
        props.putAll(map);

        return props;
    }

    public static void store(final Properties props) {
        Path path = Paths.get(System.getProperty("user.dir"), FILE_NAME);

        try (FileOutputStream fos = new FileOutputStream(path.toFile())) {
            props.store(fos, "App Configuration File");
            System.out.println(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void read() {
        try (InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(FILE_NAME)) {

            if (is == null) {
                throw new IllegalArgumentException("File not found!");
            }

            Properties props = new Properties();
            props.load(is);
            props.forEach((k, v) -> System.out.println(k + " = " + v));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
