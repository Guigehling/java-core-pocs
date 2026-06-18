package structural.facade;

public class ShippingService {

    public void ship(String productId, String address) {
        System.out.println("Shipping product " + productId + " to " + address);
        System.out.println("Shipping scheduled.");
    }

}
