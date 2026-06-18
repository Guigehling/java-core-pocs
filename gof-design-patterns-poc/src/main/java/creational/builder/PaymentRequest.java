package creational.builder;

public class PaymentRequest {

    private final String customerName;
    private final String paymentMethod;
    private final double amount;
    private final String currency;
    private final boolean saveCard;
    private final String couponCode;

    private PaymentRequest(PaymentRequestBuilder builder) {
        this.customerName = builder.customerName;
        this.paymentMethod = builder.paymentMethod;
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.saveCard = builder.saveCard;
        this.couponCode = builder.couponCode;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "customerName='" + customerName + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", saveCard=" + saveCard +
                ", couponCode='" + couponCode + '\'' +
                '}';
    }

    public static class PaymentRequestBuilder {

        private String customerName;
        private String paymentMethod;
        private double amount;
        private String currency = "BRL";
        private boolean saveCard = false;
        private String couponCode;

        public PaymentRequestBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public PaymentRequestBuilder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public PaymentRequestBuilder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public PaymentRequestBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public PaymentRequestBuilder saveCard(boolean saveCard) {
            this.saveCard = saveCard;
            return this;
        }

        public PaymentRequestBuilder couponCode(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }

        public PaymentRequest build() {
            if (customerName == null || paymentMethod == null) {
                throw new IllegalArgumentException("Customer name and payment method are required");
            }

            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero");
            }

            return new PaymentRequest(this);
        }
    }

}
