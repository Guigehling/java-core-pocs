package structural.facade;

public class FacadeApp {

    public static void main(String[] args) {

        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder(
                "CUST-001",
                "PROD-123",
                2,
                499.90,
                "Rua das Armas, 123 - Brasil"
        );
    }

}
