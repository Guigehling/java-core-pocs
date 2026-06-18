package behavioral.chainofresponsibility;

public class ChainApp {

    public static void main(String[] args) {

        OrderHandler chain = OrderProcessor.createChain();

        Order order1 = new Order("1", "USER_001", "PROD_1", 2, 500.0);
        chain.handle(order1);

        System.out.println("-----");

        Order order2 = new Order("2", "FRAUD_USER", "PROD_2", 1, 200.0);
        chain.handle(order2);
    }

}
