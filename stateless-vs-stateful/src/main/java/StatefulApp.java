import model.Product;
import stateful.ShoppingCart;

public class StatefulApp {

    public static void main(String[] args) {

        // =========================================
        // PRODUCTS
        // =========================================
        Product notebook = new Product(1L, "Notebook", 5000.00);
        Product mouse = new Product(2L, "Mouse", 150.00);

        // =========================================
        // CREATE CART
        // =========================================
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Initial cart size: " + cart.size());

        // =========================================
        // ADD PRODUCTS
        // =========================================
        cart.addProduct(notebook, 1);
        cart.addProduct(mouse, 2);

        // =========================================
        // STATE
        // =========================================
        System.out.println("Cart size: " + cart.size());
        System.out.println("Cart total: " + cart.getTotal());

        // =========================================
        // REMOVE PRODUCT
        // =========================================
        cart.removeProduct(mouse);
        System.out.println("Cart size after remove: " + cart.size());
        System.out.println("Cart total after remove: " + cart.getTotal());

        // =========================================
        // CLEAR STATE
        // =========================================
        cart.clear();

        System.out.println("Cart size after clear: " + cart.size());
    }
}