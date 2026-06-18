package structural.bridge;

public class BridgeApp {

    public static void main(String[] args) {

        PaymentProcessor pixPayment = new PixPayment(new PixGateway());
        pixPayment.process(150.00);

        System.out.println("-----");

        PaymentProcessor creditCardPayment = new CreditCardPayment(new CreditCardGateway());
        creditCardPayment.process(999.99);

        System.out.println("-----");

        PaymentProcessor pixViaPayPal = new PixPayment(new PayPalGateway());
        pixViaPayPal.process(200.00);
    }

}
