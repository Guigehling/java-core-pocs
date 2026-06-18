package behavioral.interpreter;

public class DiscountRule implements Expression {

    private final String rule;

    public DiscountRule(String rule) {
        this.rule = rule;
    }

    @Override
    public boolean interpret(Context context) {
        return switch (rule) {
            case "VIP" -> context.isVip();
            case "HIGH_VALUE" -> context.getTotalAmount() >= 500;
            case "VIP_AND_HIGH_VALUE" -> context.isVip() && context.getTotalAmount() >= 500;
            case "VIP_OR_HIGH_VALUE" -> context.isVip() || context.getTotalAmount() >= 500;

            default -> false;
        };
    }

}
