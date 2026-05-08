import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MainV1 {

    public static void main(String[] args) {
        try {
            // ---------------------------==
            // 1. CREATE
            // ---------------------------==
            Properties props = new Properties();
            props.setProperty("app.name", "Properties-api POC");
            props.setProperty("app.version", "1.0.0");

            System.out.println("--- CREATE ---");
            props.forEach((k, v) -> System.out.println(k + " = " + v));

            // ---------------------------==
            // 2. STORE
            // ---------------------------==
            File file = new File("properties-api/src/main/resources/app.properties");
            try (FileOutputStream fos = new FileOutputStream(file)) {
                props.store(fos, "Arquivo de configuracao da aplicacao");
            }

            System.out.println("Arquivo config.properties criado com sucesso!");

            // ---------------------------==
            // 3. READ
            // ---------------------------==
            Properties loadedProps = new Properties();
            try (FileInputStream fis = new FileInputStream(file)) {
                loadedProps.load(fis);
            }

            System.out.println("--- LOAD ---");
            loadedProps.forEach((k, v) -> System.out.println(k + " = " + v));

            String name = loadedProps.getProperty("app.name");
            String version = loadedProps.getProperty("app.version");

            System.out.println("--- READ ---");
            System.out.println("name: " + name);
            System.out.println("Version: " + version);

            // ---------------------------==
            // 4. SYSTEM PROPERTIES
            // ---------------------------==
            System.out.println("--- SYSTEM PROPERTIES ---");

            System.out.println("Java Version: " + System.getProperty("java.version"));
            System.out.println("OS Name: " + System.getProperty("os.name"));
            System.out.println("User Home: " + System.getProperty("user.home"));

            // ---------------------------==
            // 5. SET SYSTEM PROPERTY
            // ---------------------------==
            System.setProperty("app.env", "dev");

            System.out.println("New system propertie:");
            System.out.println("app.env = " + System.getProperty("app.env"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
