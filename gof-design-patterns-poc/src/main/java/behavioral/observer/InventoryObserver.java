package behavioral.observer;

public class InventoryObserver implements Observer {

    @Override
    public void update(OrderEvent event) {

        if (event.getStatus().equals("CREATED")) {
            System.out.println("Inventory: reserving stock for order " + event.getOrderId());
        }
    }

}
