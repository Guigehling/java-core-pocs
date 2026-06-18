package structural.adapter;

public class PayPalAdapter implements PaymentProcessor {

    private final LegacyPayPalService legacyPayPalService;

    public PayPalAdapter(LegacyPayPalService legacyPayPalService) {
        this.legacyPayPalService = legacyPayPalService;
    }

    @Override
    public void processPayment(double amount) {
        double convertedAmount = convertReaisToDollars(amount);
        legacyPayPalService.sendPayment(convertedAmount);
    }

    private double convertReaisToDollars(double amount) {
        double exchangeRate = 5.0;
        return amount / exchangeRate;
    }

}
