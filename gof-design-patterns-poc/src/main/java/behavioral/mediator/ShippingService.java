package behavioral.mediator;

public class ShippingService {

    private final Mediator mediator;

    public ShippingService(Mediator mediator) {
        this.mediator = mediator;
    }

    public void shipOrder(String orderId) {
        System.out.println("Order shipped: " + orderId);
        mediator.notify(this, "ORDER_SHIPPED", orderId);
    }

}
