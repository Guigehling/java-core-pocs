package structural.facade;

public class PaymentService {

    public void charge(double amount) {
        System.out.println("Processing payment of R$ " + amount);
        System.out.println("Payment approved.");
    }

}
