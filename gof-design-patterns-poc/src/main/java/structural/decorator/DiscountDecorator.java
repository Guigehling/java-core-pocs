package structural.decorator;

public class DiscountDecorator extends OrderDecorator {

    private final double discountPercentage;

    public DiscountDecorator(OrderComponent order, double discountPercentage) {
        super(order);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String getDescription() {
        return order.getDescription() + " + Discount (" + discountPercentage + "%)";
    }

    @Override
    public double getTotalPrice() {
        return order.getTotalPrice() * (1 - discountPercentage / 100);
    }

}
