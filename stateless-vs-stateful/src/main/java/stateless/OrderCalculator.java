package stateless;

import model.OrderItem;

import java.util.List;

public class OrderCalculator {

    // =========================================
    // STATELESS SERVICE
    // =========================================
    //
    // A classe não mantém estado entre as chamadas.
    //
    // Cada chamada recebe todos os dados necessários
    // para executar a operação.
    //
    // Não temos atributos como:
    //
    // private double total;
    // private List<OrderItem> items;
    //
    // Portanto, diferentes threads podem utilizar
    // a mesma instância sem compartilhar estado
    // mutável entre elas.
    // =========================================

    public double calculateTotal(List<OrderItem> items) {
        return items.stream()
                .mapToDouble(OrderItem::total)
                .sum();
    }

    public double calculateTotalWithDiscount(List<OrderItem> items,
                                             double discount) {
        double total = calculateTotal(items);
        return total - (total * discount);
    }
}