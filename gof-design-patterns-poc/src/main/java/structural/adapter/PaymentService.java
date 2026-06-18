package structural.adapter;

public class PaymentService {

    private final PaymentProcessor processor;

    public PaymentService(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void executePayment(double amount) {
        processor.processPayment(amount);
    }
}


