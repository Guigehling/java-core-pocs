package behavioral.strategy;

public class StrategyApp {

    public static void main(String[] args) {

        PaymentService service = new PaymentService(new PixPayment());

        service.process(500);
    }

}
