package structural.adapter;

public class PixPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PIX payment: R$ " + amount);
        System.out.println("PIX payment completed instantly.");
    }

}
