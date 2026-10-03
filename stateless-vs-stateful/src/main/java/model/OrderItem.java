package model;

public record OrderItem(Product product,
                        int quantity) {

    public double total() {
        return product.price() * quantity;
    }

}