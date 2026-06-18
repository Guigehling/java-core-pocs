package behavioral.state;

public class PaidState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Order has already been paid.");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Order shipped.");
        order.setState(new ShippedState());
    }

    @Override
    public String getName() {
        return "PAID";
    }

}
