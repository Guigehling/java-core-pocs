package behavioral.templatemethod;

public class TemplateMethodApp {

    public static void main(String[] args) {

        OrderProcessor pixProcessor = new PixOrderProcessor();
        pixProcessor.processOrder(150.00);

        System.out.println("-----");

        OrderProcessor creditCardProcessor = new CreditCardOrderProcessor();
        creditCardProcessor.processOrder(299.90);
    }

}
