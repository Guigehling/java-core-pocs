package structural.proxy;

public class ProxyApp {

    public static void main(String[] args) {

        ProductService productService = new ProductServiceProxy();

        System.out.println(productService.getProductById("1"));
        System.out.println("-----");

        System.out.println(productService.getProductById("1"));
        System.out.println("-----");

        System.out.println(productService.getProductById("2"));
        System.out.println("-----");

        System.out.println(productService.getProductById("2"));
    }

}
