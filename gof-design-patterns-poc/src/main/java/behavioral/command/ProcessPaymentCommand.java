package behavioral.command;

public class ProcessPaymentCommand implements Command {

    private final OrderService orderService;
    private final String orderId;
    private final double amount;

    public ProcessPaymentCommand(OrderService orderService, String orderId, double amount) {
        this.orderService = orderService;
        this.orderId = orderId;
        this.amount = amount;
    }

    @Override
    public void execute() {
        orderService.processPayment(orderId, amount);
    }

}
