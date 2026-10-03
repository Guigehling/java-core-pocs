package stateful;

import model.OrderItem;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeShoppingCart {

    // =========================================
    // SHARED MUTABLE STATE
    // =========================================
    //
    // O estado é compartilhado entre as threads.
    //
    // Por isso precisamos proteger o acesso.
    // =========================================

    private final List<OrderItem> items = new ArrayList<>();

    public synchronized void addProduct(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public synchronized void removeProduct(Product product) {
        items.removeIf(item -> item.product().id().equals(product.id()));
    }

    public synchronized List<OrderItem> getItems() {
        return List.copyOf(items);
    }

    public synchronized double getTotal() {
        return items.stream()
                .mapToDouble(OrderItem::total)
                .sum();
    }

    public synchronized int size() {
        return items.size();
    }

    public synchronized void clear() {
        items.clear();
    }
}