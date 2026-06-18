package behavioral.mediator;

public class PaymentService {

    private final Mediator mediator;

    public PaymentService(Mediator mediator) {
        this.mediator = mediator;
    }

    public void processPayment(String orderId) {
        System.out.println("Payment processed for order: " + orderId);
        mediator.notify(this, "PAYMENT_APPROVED", orderId);
    }

}
