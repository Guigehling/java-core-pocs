package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ProductFlyweightFactory {

    private static final Map<String, ProductFlyweight> cache = new HashMap<>();

    public static ProductFlyweight getFlyweight(String brand) {
        if (!cache.containsKey(brand)) {
            System.out.println("Creating new Flyweight for brand: " + brand);
            cache.put(brand, new ConcreteProductFlyweight(brand));
        }

        return cache.get(brand);
    }

    public static int getTotalFlyweights() {
        return cache.size();
    }

}
