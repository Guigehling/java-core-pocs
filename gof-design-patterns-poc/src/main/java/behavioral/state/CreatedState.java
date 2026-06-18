package behavioral.state;

public class CreatedState implements OrderState {

    @Override
    public void pay(Order order) {
        System.out.println("Payment approved.");
        order.setState(new PaidState());
    }

    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship an order before payment.");
    }

    @Override
    public String getName() {
        return "CREATED";
    }

}
