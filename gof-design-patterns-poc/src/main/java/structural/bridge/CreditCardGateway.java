package structural.bridge;

public class CreditCardGateway implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("Processing payment via Credit Card Gateway: R$ " + amount);
        System.out.println("Credit Card authorized and completed.");
    }

}
