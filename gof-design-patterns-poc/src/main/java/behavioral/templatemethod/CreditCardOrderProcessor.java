package behavioral.templatemethod;

public class CreditCardOrderProcessor extends OrderProcessor {

    @Override
    protected void processPayment(double amount) {
        System.out.println("Processing credit card payment: R$ " + amount);
    }

}
