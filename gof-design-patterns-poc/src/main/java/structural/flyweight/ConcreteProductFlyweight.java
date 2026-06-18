package structural.flyweight;

public class ConcreteProductFlyweight implements ProductFlyweight {

    private final String brand;

    public ConcreteProductFlyweight(String brand) {
        this.brand = brand;
    }

    @Override
    public void display(ProductContext context) {
        System.out.println("Brand: " + brand +
                " | Product: " + context.getName() +
                " | Price: R$ " + context.getPrice() +
                " | Category: " + context.getCategory());
    }

}
