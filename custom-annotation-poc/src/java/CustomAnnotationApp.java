import model.Person;
import model.User;
import processor.EncryptAnnotationProcessor;

public class CustomAnnotationApp {

    public static void main(String[] args) {

        // =========================================
        // EXAMPLE - 01
        // =========================================
        User user = new User("Guilherme", "123456", "12345678900");
        EncryptAnnotationProcessor.process(user);

        // =========================================
        // EXAMPLE - 02
        // =========================================
        Person person = new Person("Guilherme", "123456");
        System.out.println(person.getEmail());
        System.out.println(person.getEmailMasked());
    }
}