package behavioral.iterator;

import java.util.List;

public class CartItemIterator implements CartIterator {

    private final List<Item> items;
    private int position = 0;

    public CartItemIterator(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Item next() {
        return items.get(position++);
    }

}
