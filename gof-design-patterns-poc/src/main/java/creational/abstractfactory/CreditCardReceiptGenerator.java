package creational.abstractfactory;

public class CreditCardReceiptGenerator implements ReceiptGenerator {

    @Override
    public void generate(double amount) {
        System.out.println("Generating Credit Card receipt: R$ " + amount);
    }

}
