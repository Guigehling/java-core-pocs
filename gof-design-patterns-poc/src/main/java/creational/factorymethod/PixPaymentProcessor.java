package creational.factorymethod;

public class PixPaymentProcessor implements PaymentProcessor {

    @Override
    public void process(double amount) {
        System.out.println("Processing PIX payment of R$ " + amount);
        System.out.println("PIX payment completed instantly.");
    }

}
