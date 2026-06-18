package behavioral.visitor;

public interface Visitor {

    void visit(Product product);

    void visit(Shipping shipping);

}
