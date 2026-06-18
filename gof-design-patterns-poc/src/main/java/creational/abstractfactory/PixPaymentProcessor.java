package creational.abstractfactory;

public class PixPaymentProcessor implements PaymentProcessor {

    @Override
    public void process(double amount) {
        System.out.println("Processing PIX payment: R$ " + amount);
    }

}
