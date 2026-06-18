package creational.prototype;

public class PrototypeApp {

    public static void main(String[] args) {

        // Prototype base for PIX payments
        PixPaymentTemplate pixPrototype = new PixPaymentTemplate();
        pixPrototype.setCurrency("BRL");
        pixPrototype.setRecurring(false);

        PaymentTemplate pixPayment1 = pixPrototype.clone();
        pixPayment1.setCustomerName("Guilherme");
        pixPayment1.setAmount(120.50);
        pixPayment1.process();

        System.out.println("-----");

        PaymentTemplate pixPayment2 = pixPrototype.clone();
        pixPayment2.setCustomerName("Maria");
        pixPayment2.setAmount(300.00);
        pixPayment2.setRecurring(true);
        pixPayment2.process();

        System.out.println("-----");

        // Prototype base for Credit Card payments
        CreditCardPaymentTemplate cardPrototype = new CreditCardPaymentTemplate();
        cardPrototype.setCurrency("BRL");

        PaymentTemplate cardPayment = cardPrototype.clone();
        cardPayment.setCustomerName("João");
        cardPayment.setAmount(999.99);
        cardPayment.setRecurring(true);
        cardPayment.process();
    }

}
