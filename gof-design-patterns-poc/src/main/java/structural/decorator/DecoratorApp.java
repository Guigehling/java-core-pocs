package structural.decorator;

public class DecoratorApp {

    public static void main(String[] args) {

        OrderComponent order = new SimpleOrder("Guilherme", 500.00);

        System.out.println(order.getDescription());
        System.out.println("Total: R$ " + order.getTotalPrice());

        System.out.println("-----");

        order = new DiscountDecorator(order, 10);
        order = new ExpressShippingDecorator(order, 25);
        order = new InsuranceDecorator(order, 15);

        System.out.println(order.getDescription());
        System.out.println("Final Total: R$ " + order.getTotalPrice());
    }

}
