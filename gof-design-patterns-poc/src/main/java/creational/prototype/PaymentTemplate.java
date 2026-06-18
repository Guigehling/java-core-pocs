package creational.prototype;

public abstract class PaymentTemplate implements Cloneable {

    protected String customerName;
    protected double amount;
    protected String currency;
    protected String paymentMethod;
    protected boolean recurring;

    public abstract void process();

    public PaymentTemplate clone() {
        try {
            return (PaymentTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setRecurring(boolean recurring) {
        this.recurring = recurring;
    }

    @Override
    public String toString() {
        return "PaymentTemplate{" +
                "customerName='" + customerName + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", recurring=" + recurring +
                '}';
    }

}
