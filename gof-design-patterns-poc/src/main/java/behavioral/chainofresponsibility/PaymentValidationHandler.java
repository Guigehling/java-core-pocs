package behavioral.chainofresponsibility;

public class PaymentValidationHandler extends OrderHandler {

    @Override
    protected boolean process(Order order) {
        System.out.println("Validating payment for order: " + order.getOrderId());
        return order.getAmount() > 0;
    }

}
