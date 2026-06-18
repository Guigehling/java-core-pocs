package structural.facade;

public class FraudService {

    public boolean checkFraud(String customerId, double amount) {
        System.out.println("Running fraud check for customer: " + customerId);
        return true;
    }

}
