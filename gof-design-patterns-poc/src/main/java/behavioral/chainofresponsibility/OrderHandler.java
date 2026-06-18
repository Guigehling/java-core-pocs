package behavioral.chainofresponsibility;

public abstract class OrderHandler {

    private OrderHandler next;

    public OrderHandler setNext(OrderHandler next) {
        this.next = next;
        return next;
    }

    public void handle(Order order) {
        if (process(order)) {
            if (next != null) {
                next.handle(order);
            } else {
                System.out.println("Order processed successfully!");
            }
        } else {
            System.out.println("Order rejected in: " + this.getClass().getSimpleName());
        }
    }

    protected abstract boolean process(Order order);

}
