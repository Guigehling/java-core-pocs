package creational.abstractfactory;

public class AbstractFactoryApp {

    public static void main(String[] args) {

        PaymentFactory pixFactory = new PixPaymentFactory();
        PaymentProcessor pixProcessor = pixFactory.createPaymentProcessor();
        ReceiptGenerator pixReceipt = pixFactory.createReceiptGenerator();

        pixProcessor.process(500.00);
        pixReceipt.generate(500.00);

        System.out.println();

        PaymentFactory cardFactory = new CreditCardPaymentFactory();
        PaymentProcessor cardProcessor = cardFactory.createPaymentProcessor();
        ReceiptGenerator cardReceipt = cardFactory.createReceiptGenerator();

        cardProcessor.process(750.00);
        cardReceipt.generate(750.00);

    }

}
