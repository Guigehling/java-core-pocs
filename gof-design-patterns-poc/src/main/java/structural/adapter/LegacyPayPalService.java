package structural.adapter;

public class LegacyPayPalService {

    public void sendPayment(double valueInDollars) {
        System.out.println("Processing payment via Legacy PayPal system: $" + valueInDollars);
        System.out.println("Payment completed via PayPal Legacy API.");
    }

}
