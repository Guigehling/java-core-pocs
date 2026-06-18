package structural.adapter;

public class AdapterApp {

    public static void main(String[] args) {

        PaymentService pixService = new PaymentService(new PixPaymentProcessor());
        pixService.executePayment(150.00);

        System.out.println("-----");

        LegacyPayPalService legacyPayPal = new LegacyPayPalService();
        PaymentService paypalService = new PaymentService(new PayPalAdapter(legacyPayPal));
        paypalService.executePayment(500.00);
    }

}
