package behavioral.memento;

public class Order {

    private String product;
    private int quantity;
    private double price;

    public Order(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return quantity * price;
    }

    public void show() {
        System.out.println("Product: " + product +
                " | Quantity: " + quantity +
                " | Price: " + price +
                " | Total: " + getTotal());
    }

    // cria snapshot (memento)
    public OrderMemento save() {
        return new OrderMemento(product, quantity, price);
    }

    // restaura estado anterior
    public void restore(OrderMemento memento) {
        this.product = memento.getProduct();
        this.quantity = memento.getQuantity();
        this.price = memento.getPrice();
    }

}
