package creational.abstractfactory;

public class CreditCardPaymentProcessor implements PaymentProcessor {

    @Override
    public void process(double amount) {
        System.out.println("Processing Credit Card payment: R$ " + amount);
    }

}
