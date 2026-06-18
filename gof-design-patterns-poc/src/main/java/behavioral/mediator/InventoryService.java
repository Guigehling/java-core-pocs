package behavioral.mediator;

public class InventoryService {

    private final Mediator mediator;

    public InventoryService(Mediator mediator) {
        this.mediator = mediator;
    }

    public void reserveStock(String orderId) {
        System.out.println("Stock reserved for order: " + orderId);
        mediator.notify(this, "STOCK_RESERVED", orderId);
    }

}
