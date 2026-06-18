package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public CartIterator iterator() {
        return new CartItemIterator(items);
    }

}
