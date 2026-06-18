package behavioral.templatemethod;

public abstract class OrderProcessor {

    // Template Method
    public final void processOrder(double amount) {
        validateOrder();
        processPayment(amount);
        sendConfirmation();
    }

    private void validateOrder() {
        System.out.println("Validating order...");
    }

    protected abstract void processPayment(double amount);

    private void sendConfirmation() {
        System.out.println("Sending confirmation email...");
    }

}
