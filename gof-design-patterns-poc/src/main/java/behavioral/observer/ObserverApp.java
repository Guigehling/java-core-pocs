package behavioral.observer;

public class ObserverApp {

    public static void main(String[] args) {

        OrderEventManager manager = new OrderEventManager();

        manager.addObserver(new InventoryObserver());
        manager.addObserver(new PaymentObserver());
        manager.addObserver(new NotificationObserver());
        manager.addObserver(new AnalyticsObserver());

        System.out.println("=== ORDER CREATED ===");
        manager.changeOrderStatus("ORDER-1", "CREATED");

        System.out.println("\n=== ORDER SHIPPED ===");
        manager.changeOrderStatus("ORDER-1", "SHIPPED");
    }

}
