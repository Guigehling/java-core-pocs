package structural.flyweight;

public class FlyweightApp {

    public static void main(String[] args) {

        ProductFlyweight apple = ProductFlyweightFactory.getFlyweight("Apple");
        ProductFlyweight samsung = ProductFlyweightFactory.getFlyweight("Samsung");
        ProductFlyweight apple2 = ProductFlyweightFactory.getFlyweight("Apple"); // reutiliza - é o mesmo em memória

        System.out.println("-----");

        apple.display(new ProductContext("1", "iPhone 15", 7999.99, "Smartphone"));
        samsung.display(new ProductContext("2", "Galaxy S24", 6999.99, "Smartphone"));
        apple2.display(new ProductContext("3", "MacBook Pro", 12999.99, "Notebook"));

        System.out.println("-----");
        System.out.println("Total Flyweights created: " + ProductFlyweightFactory.getTotalFlyweights());
    }

}
