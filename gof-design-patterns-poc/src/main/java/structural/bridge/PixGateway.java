package structural.bridge;

public class PixGateway implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("Processing payment via PIX Gateway: R$ " + amount);
        System.out.println("PIX transaction completed instantly.");
    }

}
