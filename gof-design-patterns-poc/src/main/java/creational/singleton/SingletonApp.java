package creational.singleton;

public class SingletonApp {

    public static void main(String[] args) {

        PaymentGatewayConfiguration configuration1 = PaymentGatewayConfiguration.getInstance();
        PaymentGatewayConfiguration configuration2 = PaymentGatewayConfiguration.getInstance();

        System.out.println("Same instance: " + (configuration1 == configuration2));

        System.out.println();

        System.out.println("Provider : " + configuration1.getProvider());
        System.out.println("Currency : " + configuration1.getCurrency());
        System.out.println("Timeout  : " + configuration1.getTimeoutInSeconds() + " seconds");

    }

}
