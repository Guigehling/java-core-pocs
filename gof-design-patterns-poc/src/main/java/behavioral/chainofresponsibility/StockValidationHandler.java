package behavioral.chainofresponsibility;

public class StockValidationHandler extends OrderHandler {

    @Override
    protected boolean process(Order order) {
        System.out.println("Checking stock for product: " + order.getProductId());
        return order.getQuantity() <= 10;
    }

}
