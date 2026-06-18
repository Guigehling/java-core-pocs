package structural.bridge;

public abstract class PaymentProcessor {

    protected PaymentGateway gateway;

    protected PaymentProcessor(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public abstract void process(double amount);

}
