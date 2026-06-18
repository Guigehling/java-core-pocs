package behavioral.mediator;

public class CheckoutMediator implements Mediator {

    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private NotificationService notificationService;

    public void setInventoryService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void notify(Object sender, String event, String data) {
        switch (event) {
            case "ORDER_CREATED" -> {
                inventoryService.reserveStock(data);
                paymentService.processPayment(data);
            }
            case "PAYMENT_APPROVED" -> shippingService.shipOrder(data);
            case "ORDER_SHIPPED" -> notificationService.sendNotification(data);

        }
    }

}
