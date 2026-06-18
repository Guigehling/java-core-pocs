package structural.decorator;

public abstract class OrderDecorator implements OrderComponent {

    protected final OrderComponent order;

    protected OrderDecorator(OrderComponent order) {
        this.order = order;
    }

    @Override
    public String getDescription() {
        return order.getDescription();
    }

    @Override
    public double getTotalPrice() {
        return order.getTotalPrice();
    }

}
