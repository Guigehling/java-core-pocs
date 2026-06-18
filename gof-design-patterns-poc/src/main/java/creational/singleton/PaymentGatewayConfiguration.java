package creational.singleton;

public class PaymentGatewayConfiguration {

    // =========================================
    // SINGLETON INSTANCE
    // =========================================
    private static final PaymentGatewayConfiguration INSTANCE = new PaymentGatewayConfiguration();

    // =========================================
    // CONFIGURATION PROPERTIES
    // =========================================
    private final String provider;
    private final String currency;
    private final int timeoutInSeconds;

    // =========================================
    // PRIVATE CONSTRUCTOR
    // =========================================
    private PaymentGatewayConfiguration() {
        this.provider = "Stripe";
        this.currency = "BRL";
        this.timeoutInSeconds = 30;
    }

    // =========================================
    // ACCESS METHOD
    // =========================================
    public static PaymentGatewayConfiguration getInstance() {
        return INSTANCE;
    }

    // =========================================
    // GETTERS
    // =========================================
    public String getProvider() {
        return provider;
    }

    public String getCurrency() {
        return currency;
    }

    public int getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

}
