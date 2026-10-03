package stateful;

import model.OrderItem;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    // =========================================
    // STATE
    // =========================================
    //
    // O carrinho mantém informações entre as
    // chamadas dos métodos.
    //
    // Esse é o estado do objeto.
    // =========================================

    private final List<OrderItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public void removeProduct(Product product) {
        items.removeIf(item -> item.product().id().equals(product.id()));
    }

    public List<OrderItem> getItems() {
        return List.copyOf(items);
    }

    public double getTotal() {
        return items.stream()
                .mapToDouble(OrderItem::total)
                .sum();
    }

    public void clear() {
        items.clear();
    }

    public int size() {
        return items.size();
    }
}