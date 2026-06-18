package behavioral.command;

public class OrderService {

    public void createOrder(String orderId) {
        System.out.println("Order created: " + orderId);
    }

    public void processPayment(String orderId, double amount) {
        System.out.println("Payment processed for order " + orderId + " | R$ " + amount);
    }

    public void shipOrder(String orderId) {
        System.out.println("Order shipped: " + orderId);
    }

}
