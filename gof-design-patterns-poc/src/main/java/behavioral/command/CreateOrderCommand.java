package behavioral.command;

public class CreateOrderCommand implements Command {

    private final OrderService orderService;
    private final String orderId;

    public CreateOrderCommand(OrderService orderService, String orderId) {
        this.orderService = orderService;
        this.orderId = orderId;
    }

    @Override
    public void execute() {
        orderService.createOrder(orderId);
    }

}
