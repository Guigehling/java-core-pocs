package behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double value) {
        System.out.println("Credit Card: " + value);
    }

}
