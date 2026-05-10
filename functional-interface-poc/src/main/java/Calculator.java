@FunctionalInterface
public interface Calculator {

    int sum(int a, int b);

    default void log(int result) {
        System.out.println("Result: " + result);
    }

}
