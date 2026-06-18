package behavioral.strategy;

public class StrategyApp {

    public static void main(String[] args) {

        CheckoutService checkout = new CheckoutService(new PixPaymentStrategy());

        checkout.checkout(150.00);

        checkout.setPaymentStrategy(new CreditCardPaymentStrategy());
        checkout.checkout(299.90);

        checkout.setPaymentStrategy(new BoletoPaymentStrategy());
        checkout.checkout(89.50);
    }

}
