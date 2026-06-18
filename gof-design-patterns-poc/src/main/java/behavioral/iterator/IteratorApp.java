package behavioral.iterator;

public class IteratorApp {

    public static void main(String[] args) {

        Cart cart = new Cart();
        cart.addItem(new Item("Mouse Gamer", 150));
        cart.addItem(new Item("Keyboard", 300));
        cart.addItem(new Item("Monitor", 1200));

        CartIterator iterator = cart.iterator();

        double total = 0;
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item.getName() + " - R$ " + item.getPrice());
            total += item.getPrice();
        }

        System.out.println("-----");
        System.out.println("Total: R$ " + total);
    }

}
