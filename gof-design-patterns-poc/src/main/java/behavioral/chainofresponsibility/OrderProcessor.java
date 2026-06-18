package behavioral.chainofresponsibility;

public class OrderProcessor {

    public static OrderHandler createChain() {
        OrderHandler stock = new StockValidationHandler();
        OrderHandler payment = new PaymentValidationHandler();
        OrderHandler fraud = new FraudValidationHandler();
        OrderHandler shipping = new ShippingValidationHandler();

        stock.setNext(payment).setNext(fraud).setNext(shipping);

        return stock;
    }

}
