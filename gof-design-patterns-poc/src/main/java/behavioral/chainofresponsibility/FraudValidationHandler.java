package behavioral.chainofresponsibility;

public class FraudValidationHandler extends OrderHandler {

    @Override
    protected boolean process(Order order) {
        System.out.println("Running fraud check for customer: " + order.getCustomerId());
        return !order.getCustomerId().equals("FRAUD_USER");
    }

}
