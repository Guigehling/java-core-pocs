package behavioral.observer;

public class PaymentObserver implements Observer {

    @Override
    public void update(OrderEvent event) {
        if (event.getStatus().equals("CREATED")) {
            System.out.println("Payment: processing payment for order " + event.getOrderId());
        }
    }

}
