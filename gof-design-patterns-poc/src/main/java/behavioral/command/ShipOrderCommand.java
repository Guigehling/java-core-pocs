package behavioral.command;

public class ShipOrderCommand implements Command {

    private final OrderService orderService;
    private final String orderId;

    public ShipOrderCommand(OrderService orderService, String orderId) {
        this.orderService = orderService;
        this.orderId = orderId;
    }

    @Override
    public void execute() {
        orderService.shipOrder(orderId);
    }

}
