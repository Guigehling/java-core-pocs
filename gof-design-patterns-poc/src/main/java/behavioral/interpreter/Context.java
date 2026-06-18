package behavioral.interpreter;

public class Context {

    private final boolean isVip;
    private final double totalAmount;

    public Context(boolean isVip, double totalAmount) {
        this.isVip = isVip;
        this.totalAmount = totalAmount;
    }

    public boolean isVip() {
        return isVip;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

}
