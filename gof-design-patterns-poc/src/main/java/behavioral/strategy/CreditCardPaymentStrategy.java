package behavioral.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment: R$ " + amount);
    }

}
