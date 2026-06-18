package behavioral.chainofresponsibility;

public class Order {

    private final String orderId;
    private final String customerId;
    private final String productId;
    private final int quantity;
    private final double amount;

    public Order(String orderId, String customerId, String productId, int quantity, double amount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return amount;
    }

}
