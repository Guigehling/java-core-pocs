import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaceApp {

    public static void main(String[] args) {

        Calculator calculator = (a, b) -> a + b;
        int result = calculator.sum(1, 2);
        calculator.log(result);

        List<Double> payments = List.of(100.0, 1500.0, 50.0, 3000.0, 80.0);
        payments.forEach(System.out::println);

        Predicate<Double> hasHighDeposit = value -> value > 1000;
        System.out.println("Predicate Result: " + hasHighDeposit.test(1500.0));

        Function<Double, Double> applyTax = value -> value * 2.5;
        System.out.println("Function Result: " + applyTax.apply(1500.0));

        Consumer<Double> paymentProof = value -> System.out.println("Payment proof in the amount of: " + value);
        paymentProof.accept(500.0);

        payments.stream()
                .filter(hasHighDeposit)
                .map(applyTax)
                .forEach(paymentProof);

        Supplier<String> supplier = () -> "Process Completed";
        System.out.println("Supplier Result: " + supplier.get());

        Function<Double, Double> doubling = x -> x * 2;
        Function<Double, Double> plusTen = x -> x + 10;
        System.out.println("Nested Functions: " + doubling.andThen(plusTen).apply(5.0));

        BinaryOperator<Double> sum = Double::sum;
        System.out.println("BinaryOperator Result: " + sum.apply(150.0, 350.0));

        BiConsumer<String, Double> statement = (reason, value) -> System.out.println("Reason: " + reason + " | $ " + value);
        Map.of("cake", 100.0, "candle", 50.0, "decoration", 200.0)
                .forEach(statement);

    }

}
