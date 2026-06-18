package creational.factorymethod;

public class FactoryMethodApp {

    public static void main(String[] args) {

        PaymentProcessor pixProcessor = PaymentProcessorFactory.create("PIX");
        pixProcessor.process(150.75);

        System.out.println("-----");

        PaymentProcessor cardProcessor = PaymentProcessorFactory.create("CREDIT_CARD");
        cardProcessor.process(320.40);
    }

}
