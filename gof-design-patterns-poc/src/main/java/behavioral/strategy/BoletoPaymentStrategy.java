package behavioral.strategy;

public class BoletoPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Generating boleto: R$ " + amount);
    }

}
