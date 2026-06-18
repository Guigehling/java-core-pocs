package structural.composite;

public class ProductItem implements CartComponent {

    private final String name;
    private final double price;

    public ProductItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("- " + name + " | R$ " + price);
    }

}
