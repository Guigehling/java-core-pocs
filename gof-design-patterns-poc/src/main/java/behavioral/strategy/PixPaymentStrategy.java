package behavioral.strategy;

public class PixPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Processing PIX payment: R$ " + amount);
    }

}
