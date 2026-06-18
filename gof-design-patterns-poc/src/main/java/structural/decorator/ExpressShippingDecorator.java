package structural.decorator;

public class ExpressShippingDecorator extends OrderDecorator {

    private final double shippingFee;

    public ExpressShippingDecorator(OrderComponent order, double shippingFee) {
        super(order);
        this.shippingFee = shippingFee;
    }

    @Override
    public String getDescription() {
        return order.getDescription() + " + Express Shipping";
    }

    @Override
    public double getTotalPrice() {
        return order.getTotalPrice() + shippingFee;
    }

}
