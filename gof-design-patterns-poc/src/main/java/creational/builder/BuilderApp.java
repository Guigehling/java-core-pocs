package creational.builder;

public class BuilderApp {

    public static void main(String[] args) {

        PaymentRequest request = new PaymentRequest.PaymentRequestBuilder()
                .customerName("Guilherme")
                .paymentMethod("PIX")
                .amount(199.90)
                .currency("BRL")
                .saveCard(false)
                .couponCode("DESCONTO10")
                .build();

        System.out.println(request);

        PaymentRequest minimalRequest = new PaymentRequest.PaymentRequestBuilder()
                .customerName("Maria")
                .paymentMethod("CREDIT_CARD")
                .amount(350.00)
                .build();

        System.out.println(minimalRequest);
    }

}
