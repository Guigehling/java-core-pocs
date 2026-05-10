import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesApiV2App {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("app.name", "Properties API POC");
        map.put("app.versao", "1.0.0");

        System.out.println("--- CREATE FILE ---");
        Properties props = FileProperties.create(map);

        System.out.println("--- STORE FILE ---");
        FileProperties.store(props);

        System.out.println("--- READ FILE ---");
        FileProperties.read();

        System.out.println("--- CREATE SYSTEM ---");
        SystemProperties.create(Map.of("app.env", "local"));

        System.out.println("--- READ SYSTEM ---");
        SystemProperties.read("app.env");
    }

}
