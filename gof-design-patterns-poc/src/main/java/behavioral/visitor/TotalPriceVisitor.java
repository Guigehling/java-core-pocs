package behavioral.visitor;

public class TotalPriceVisitor implements Visitor {

    private double total = 0;

    @Override
    public void visit(Product product) {
        System.out.println("Product: " + product.getName() + " - R$ " + product.getPrice());
        total += product.getPrice();
    }

    @Override
    public void visit(Shipping shipping) {
        System.out.println("Shipping: R$ " + shipping.getCost());
        total += shipping.getCost();
    }

    public double getTotal() {
        return total;
    }

}
