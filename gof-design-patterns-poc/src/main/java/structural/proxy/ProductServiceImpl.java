package structural.proxy;

public class ProductServiceImpl implements ProductService {

    @Override
    public Product getProductById(String id) {

        System.out.println("Calling database for product: " + id);

        simulateSlowOperation();

        return new Product(id, "Product-" + id, Math.random() * 1000);
    }

    private void simulateSlowOperation() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
