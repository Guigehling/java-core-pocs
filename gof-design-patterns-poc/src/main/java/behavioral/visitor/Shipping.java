package behavioral.visitor;

public class Shipping implements CartElement {

    private final double cost;

    public Shipping(double cost) {
        this.cost = cost;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getCost() {
        return cost;
    }

}
