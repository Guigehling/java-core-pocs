package creational.factorymethod;

public class PaymentProcessorFactory {

    public static PaymentProcessor create(String type) {

        return switch (type) {
            case "PIX" -> new PixPaymentProcessor();
            case "CREDIT_CARD" -> new CreditCardPaymentProcessor();
            default -> throw new IllegalArgumentException("Unsupported payment type: " + type);
        };

    }

}
