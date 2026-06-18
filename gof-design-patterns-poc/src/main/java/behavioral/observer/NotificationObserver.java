package behavioral.observer;

public class NotificationObserver implements Observer {

    @Override
    public void update(OrderEvent event) {
        System.out.println("Analytics: tracking event " + event.getStatus()
                + " for order " + event.getOrderId());
    }

}
