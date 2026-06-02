import model.Customer;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;

import java.util.List;

import static org.jeasy.random.FieldPredicates.named;

public class EasyRandomApp {

    public static void main(String[] args) {

        EasyRandom easyRandom = new EasyRandom();

        // =========================================
        // DEFAULT GENERATION
        // =========================================
        Customer customer = easyRandom.nextObject(Customer.class);

        System.out.println("=== CUSTOMER ===");
        System.out.println(customer);

        // =========================================
        // COLLECTION GENERATION
        // =========================================
        List<Customer> customers = easyRandom
                .objects(Customer.class, 5)
                .toList();

        System.out.println("=== CUSTOMERS ===");
        customers.forEach(System.out::println);

        // =========================================
        // CUSTOM CONFIGURATION
        // =========================================
        EasyRandomParameters parameters = new EasyRandomParameters()
                .stringLengthRange(5, 10)
                .collectionSizeRange(3, 3);

        EasyRandom configuredRandom = new EasyRandom(parameters);
        Customer configuredCustomer = configuredRandom.nextObject(Customer.class);

        System.out.println("=== CONFIGURED CUSTOMER ===");
        System.out.println(configuredCustomer);

        // =========================================
        // EXCLUDED FIELDS
        // =========================================
        parameters = new EasyRandomParameters().excludeField(named("email"));

        configuredRandom = new EasyRandom(parameters);
        configuredCustomer = configuredRandom.nextObject(Customer.class);

        System.out.println("=== EXCLUDED FIELDS ===");
        System.out.println(configuredCustomer);

        // =========================================
        // FIXED VALUES
        // =========================================
        parameters = new EasyRandomParameters().seed(123L);

        configuredRandom = new EasyRandom(parameters);
        configuredCustomer = configuredRandom.nextObject(Customer.class);

        System.out.println("=== FIXED VALUES ===");
        System.out.println(configuredCustomer);

        // =========================================
        // CUSTOM RANDOMIZER
        // =========================================
        parameters = new EasyRandomParameters()
                .randomize(String.class, () -> "CUSTOM_STRING")
                .randomize(Integer.class, () -> 123);

        configuredRandom = new EasyRandom(parameters);
        configuredCustomer = configuredRandom.nextObject(Customer.class);

        System.out.println("=== CUSTOM RANDOMIZER ===");
        System.out.println(configuredCustomer);
    }

}
