package behavioral.strategy;

public class PixPayment implements PaymentStrategy {

    @Override
    public void pay(double value) {
        System.out.println("Payment for Pix" + value);
    }

}

