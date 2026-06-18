package behavioral.state;

public class Order {

    private OrderState state;

    public Order() {
        this.state = new CreatedState();
    }

    public void pay() {
        state.pay(this);
    }

    public void ship() {
        state.ship(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void printStatus() {
        System.out.println("Current state: " + state.getName());
    }

}
