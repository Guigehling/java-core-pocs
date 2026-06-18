package structural.bridge;

public class PixPayment extends PaymentProcessor {

    public PixPayment(PaymentGateway gateway) {
        super(gateway);
    }

    @Override
    public void process(double amount) {
        System.out.println("Starting PIX Payment flow...");
        gateway.pay(amount);
    }

}
