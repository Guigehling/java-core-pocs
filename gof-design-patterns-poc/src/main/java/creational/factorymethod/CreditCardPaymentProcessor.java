package creational.factorymethod;

public class CreditCardPaymentProcessor implements PaymentProcessor {

    @Override
    public void process(double amount) {
        System.out.println("Processing Credit Card payment of R$ " + amount);
        System.out.println("Credit card payment approved after authorization.");
    }

}
