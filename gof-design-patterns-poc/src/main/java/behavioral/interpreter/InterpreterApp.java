package behavioral.interpreter;

public class InterpreterApp {

    public static void main(String[] args) {
        Context vipUser = new Context(true, 1000);
        Context normalUser = new Context(false, 300);

        Expression rule1 = new DiscountRule("VIP");
        Expression rule2 = new DiscountRule("HIGH_VALUE");
        Expression rule3 = new DiscountRule("VIP_AND_HIGH_VALUE");

        System.out.println("VIP rule (VIP user): " + rule1.interpret(vipUser));
        System.out.println("HIGH VALUE (normal user): " + rule2.interpret(normalUser));
        System.out.println("VIP AND HIGH VALUE (VIP user): " + rule3.interpret(vipUser));
    }

}
