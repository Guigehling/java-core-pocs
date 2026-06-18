package behavioral.command;

public class CommandApp {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        Command create = new CreateOrderCommand(orderService, "ORDER-1");
        Command payment = new ProcessPaymentCommand(orderService, "ORDER-1", 250.0);
        Command ship = new ShipOrderCommand(orderService, "ORDER-1");

        CommandInvoker invoker = new CommandInvoker();

        invoker.addCommand(create);
        invoker.addCommand(payment);
        invoker.addCommand(ship);

        invoker.executeAll();
    }

}
