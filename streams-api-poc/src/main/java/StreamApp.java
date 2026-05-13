import java.util.List;
import java.util.function.Predicate;

public class StreamApp {

    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Notebook", 5000.0, "Tech"),
                new Product("Mouse", 150.0, "Tech"),
                new Product("Keyboard", 300.0, "Tech"),
                new Product("Chair", 900.0, "Furniture"),
                new Product("Desk", 1200.0, "Furniture")
        );

        // =========================================
        // FILTER + PREDICATE
        // =========================================

        Predicate<Product> expensiveProduct = product -> product.price() > 1000;

        List<Product> expensiveProducts = products.stream()
                .filter(expensiveProduct)
                .toList();

        System.out.println("-- EXPENSIVE PRODUCTS --");
        expensiveProducts.forEach(System.out::println);
    }

}
