package creational.abstractfactory;

public class PixPaymentFactory implements PaymentFactory {

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new PixPaymentProcessor();
    }

    @Override
    public ReceiptGenerator createReceiptGenerator() {
        return new PixReceiptGenerator();
    }

}
