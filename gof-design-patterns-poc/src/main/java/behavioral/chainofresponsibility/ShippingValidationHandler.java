package behavioral.chainofresponsibility;

public class ShippingValidationHandler extends OrderHandler {

    @Override
    protected boolean process(Order order) {
        System.out.println("Validating shipping for order: " + order.getOrderId());
        return true;
    }

}
