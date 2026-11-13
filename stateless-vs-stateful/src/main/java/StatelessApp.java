import model.OrderItem;
import model.Product;
import stateless.OrderCalculator;

import java.util.List;

public class StatelessApp {

    public static void main(String[] args) {

        // =========================================
        // PRODUCTS
        // =========================================
        Product notebook = new Product(1L, "Notebook", 5000.00);
        Product mouse = new Product(2L, "Mouse", 150.00);

        // =========================================
        // ORDER ITEMS
        // =========================================
        List<OrderItem> items = List.of(
                new OrderItem(notebook, 1),
                new OrderItem(mouse, 2)
        );

        // =========================================
        // STATELESS SERVICE
        // =========================================
        OrderCalculator calculator = new OrderCalculator();

        // A mesma instância pode ser reutilizada
        // várias vezes.
        double total1 = calculator.calculateTotal(items);
        double total2 = calculator.calculateTotal(items);

        System.out.println("Total 1: " + total1);
        System.out.println("Total 2: " + total2);

        double totalWithDiscount =
                calculator.calculateTotalWithDiscount(items, 0.10);

        System.out.println("Total with discount: " + totalWithDiscount);
    }

}