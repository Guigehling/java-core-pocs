package behavioral.state;

public class ShippedState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Order has already been shipped.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order has already been shipped.");
    }

    @Override
    public String getName() {
        return "SHIPPED";
    }

}
