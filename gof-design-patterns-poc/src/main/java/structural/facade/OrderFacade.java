package structural.facade;

public class OrderFacade {

    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;
    private final FraudService fraudService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.fraudService = new FraudService();
    }

    public void placeOrder(String customerId, String productId, int quantity, double price, String address) {

        System.out.println("=== Starting Order Process ===");

        if (!fraudService.checkFraud(customerId, price)) {
            System.out.println("Fraud detected! Order cancelled.");
            return;
        }

        if (!inventoryService.checkStock(productId, quantity)) {
            System.out.println("Product out of stock!");
            return;
        }

        inventoryService.reserveStock(productId, quantity);

        paymentService.charge(price);

        shippingService.ship(productId, address);

        System.out.println("=== Order Completed Successfully ===");
    }

}
