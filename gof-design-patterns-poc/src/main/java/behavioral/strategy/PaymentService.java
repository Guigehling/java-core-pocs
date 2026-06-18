package behavioral.strategy;

public class PaymentService {

    private final PaymentStrategy strategy;

    public PaymentService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(double value) {
        strategy.pay(value);
    }

}
