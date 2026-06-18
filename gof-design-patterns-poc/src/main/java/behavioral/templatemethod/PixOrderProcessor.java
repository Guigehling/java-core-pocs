package behavioral.templatemethod;

public class PixOrderProcessor extends OrderProcessor {

    @Override
    protected void processPayment(double amount) {
        System.out.println("Processing PIX payment: R$ " + amount);
    }

}
