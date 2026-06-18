package creational.abstractfactory;

public interface PaymentFactory {

    PaymentProcessor createPaymentProcessor();

    ReceiptGenerator createReceiptGenerator();

}
