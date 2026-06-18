package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements CartComponent {

    private final String name;
    private final List<CartComponent> items = new ArrayList<>();

    public ProductBundle(String name) {
        this.name = name;
    }

    public void add(CartComponent item) {
        items.add(item);
    }

    public void remove(CartComponent item) {
        items.remove(item);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return items.stream()
                .mapToDouble(CartComponent::getPrice)
                .sum();
    }

    @Override
    public void print() {
        System.out.println("Bundle: " + name);
        for (CartComponent item : items) {
            item.print();
        }
        System.out.println("Subtotal: R$ " + getPrice());
    }

}
