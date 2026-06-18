package creational.prototype;

public class PixPaymentTemplate extends PaymentTemplate {

    public PixPaymentTemplate() {
        this.paymentMethod = "PIX";
    }

    @Override
    public void process() {
        System.out.println("Processing PIX payment...");
        System.out.println(this);
        System.out.println("PIX payment completed instantly.");
    }

}
