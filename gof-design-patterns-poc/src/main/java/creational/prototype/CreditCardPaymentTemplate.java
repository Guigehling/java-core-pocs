package creational.prototype;

public class CreditCardPaymentTemplate extends  PaymentTemplate {

    public CreditCardPaymentTemplate() {
        this.paymentMethod = "CREDIT_CARD";
    }

    @Override
    public void process() {
        System.out.println("Processing Credit Card payment...");
        System.out.println(this);
        System.out.println("Credit Card payment authorized.");
    }

}
