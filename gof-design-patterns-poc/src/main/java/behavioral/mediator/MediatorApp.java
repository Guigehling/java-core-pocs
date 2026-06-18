package behavioral.mediator;

public class MediatorApp {

    public static void main(String[] args) {

        CheckoutMediator mediator = new CheckoutMediator();

        InventoryService inventory = new InventoryService(mediator);
        PaymentService payment = new PaymentService(mediator);
        ShippingService shipping = new ShippingService(mediator);
        NotificationService notification = new NotificationService();

        mediator.setInventoryService(inventory);
        mediator.setPaymentService(payment);
        mediator.setShippingService(shipping);
        mediator.setNotificationService(notification);

        System.out.println("=== ORDER FLOW START ===");

        mediator.notify(null, "ORDER_CREATED", "ORDER-1");
    }

}
