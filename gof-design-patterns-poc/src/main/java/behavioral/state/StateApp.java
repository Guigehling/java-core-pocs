package behavioral.state;

public class StateApp {

    public static void main(String[] args) {

        Order order = new Order();

        order.printStatus();

        order.ship();

        order.pay();
        order.printStatus();

        order.pay();

        order.ship();
        order.printStatus();

        order.ship();
    }

}
