import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApp {

    public static void main(String[] args) {

        List<Product> products = List.of(new Product("Notebook", 5000.0, "Tech"),
                new Product("Mouse", 150.0, "Tech"),
                new Product("Keyboard", 300.0, "Tech"),
                new Product("Chair", 900.0, "Furniture"),
                new Product("Desk", 1200.0, "Furniture"));

        // =========================================
        // FILTER + PREDICATE
        // =========================================
        Predicate<Product> expensiveProductPredicate = product -> product.price() > 1000;

        List<Product> expensiveProducts = products.stream()
                .filter(expensiveProductPredicate)
                .toList();

        System.out.println("--- EXPENSIVE PRODUCTS ---");
        expensiveProducts.forEach(System.out::println);

        // =========================================
        // MAP
        // =========================================
        List<String> names = products.stream()
                .map(Product::name)
                .toList();

        System.out.println("--- PRODUCT NAMES ---");
        names.forEach(System.out::println);

        // =========================================
        // FILTER + MAP
        // =========================================
        List<String> expensiveNames = products.stream()
                .filter(expensiveProductPredicate)
                .map(Product::name)
                .toList();

        System.out.println("--- EXPENSIVE PRODUCT NAMES ---");
        expensiveNames.forEach(System.out::println);

        // =========================================
        // ARRAYS STREAM
        // =========================================
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers).sum();

        System.out.println("--- ARRAY SUM ---");
        System.out.println(sum);


        // =========================================
        // GROUP BY
        // =========================================
        Map<String, List<Product>> groupedByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::category));

        System.out.println("--- GROUPED BY CATEGORY ---");
        groupedByCategory
                .forEach((category, items) -> System.out.println(category + " -> " + items));
    }

}
