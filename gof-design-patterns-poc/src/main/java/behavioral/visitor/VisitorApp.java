package behavioral.visitor;

public class VisitorApp {

    public static void main(String[] args) {

        CartElement[] elements = {
                new Product("Mouse Gamer", 150),
                new Product("Mechanical Keyboard", 350),
                new Shipping(40)
        };

        TotalPriceVisitor visitor = new TotalPriceVisitor();

        for (CartElement element : elements) {
            element.accept(visitor);
        }

        System.out.println("-----");
        System.out.println("Total: R$ " + visitor.getTotal());
    }

}