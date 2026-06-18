package structural.decorator;

public class SimpleOrder implements OrderComponent {

    private final String customerName;
    private final double basePrice;

    public SimpleOrder(String customerName, double basePrice) {
        this.customerName = customerName;
        this.basePrice = basePrice;
    }

    @Override
    public String getDescription() {
        return "Order for " + customerName;
    }

    @Override
    public double getTotalPrice() {
        return basePrice;
    }

}
