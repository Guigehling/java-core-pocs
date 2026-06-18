package structural.decorator;

public class InsuranceDecorator extends OrderDecorator {

    private final double insuranceFee;

    public InsuranceDecorator(OrderComponent order, double insuranceFee) {
        super(order);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public String getDescription() {
        return order.getDescription() + " + Insurance";
    }

    @Override
    public double getTotalPrice() {
        return order.getTotalPrice() + insuranceFee;
    }

}
