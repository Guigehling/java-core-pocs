package creational.abstractfactory;

public class PixReceiptGenerator implements ReceiptGenerator {

    @Override
    public void generate(double amount) {
        System.out.println("Generating PIX receipt: R$ " + amount);
    }

}
