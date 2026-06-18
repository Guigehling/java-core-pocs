package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProductServiceProxy implements ProductService {

    private final ProductServiceImpl realService = new ProductServiceImpl();
    private final Map<String, Product> cache = new HashMap<>();

    @Override
    public Product getProductById(String id) {
        if (cache.containsKey(id)) {
            System.out.println("Returning product from CACHE: " + id);
            return cache.get(id);
        }

        System.out.println("Cache miss for product: " + id);

        Product product = realService.getProductById(id);
        cache.put(id, product);

        return product;
    }

}
