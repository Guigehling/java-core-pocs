package structural.facade;

public class InventoryService {

    public boolean checkStock(String productId, int quantity) {
        System.out.println("Checking stock for product: " + productId);
        return true;
    }

    public void reserveStock(String productId, int quantity) {
        System.out.println("Reserving stock for product: " + productId + " | qty: " + quantity);
    }

}
