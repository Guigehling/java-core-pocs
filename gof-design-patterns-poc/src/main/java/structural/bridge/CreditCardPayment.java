package structural.bridge;

public class CreditCardPayment extends PaymentProcessor {

    public CreditCardPayment(PaymentGateway gateway) {
        super(gateway);
    }

    @Override
    public void process(double amount) {
        System.out.println("Starting Credit Card Payment flow...");
        gateway.pay(amount);
    }

}
