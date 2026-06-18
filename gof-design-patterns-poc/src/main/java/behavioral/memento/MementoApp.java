package behavioral.memento;

public class MementoApp {

    public static void main(String[] args) {

        Order order = new Order("Mouse Gamer", 1, 150.0);
        OrderHistory history = new OrderHistory();

        System.out.println("=== INITIAL STATE ===");
        order.show();

        history.save(order.save());

        order.setQuantity(2);
        order.setPrice(140.0);

        System.out.println("\n=== AFTER CHANGE ===");
        order.show();

        history.save(order.save());

        order.setProduct("Keyboard");
        order.setQuantity(1);
        order.setPrice(300.0);

        System.out.println("\n=== AFTER SECOND CHANGE ===");
        order.show();

        // UNDO
        System.out.println("\n=== UNDO ACTION ===");
        order.restore(history.undo());
        order.show();

        System.out.println("\n=== UNDO AGAIN ===");
        order.restore(history.undo());
        order.show();
    }

}
