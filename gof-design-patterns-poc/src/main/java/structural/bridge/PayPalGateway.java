package structural.bridge;

public class PayPalGateway implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("Processing payment via PayPal Gateway: $" + amount);
        System.out.println("PayPal transaction completed.");
    }

}
