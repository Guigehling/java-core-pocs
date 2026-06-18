package creational.abstractfactory;

public class CreditCardPaymentFactory implements PaymentFactory {

    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CreditCardPaymentProcessor();
    }

    @Override
    public ReceiptGenerator createReceiptGenerator() {
        return new CreditCardReceiptGenerator();
    }

}
