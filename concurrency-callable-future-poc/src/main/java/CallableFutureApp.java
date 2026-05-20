import java.util.concurrent.*;

public class CallableFutureApp {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // =========================================
        // CALLABLE
        // =========================================
        Callable<String> paymentTask = () -> {
            System.out.println("Processing payment...");
            Thread.sleep(2000);
            return "Payment processed successfully";
        };

        // =========================================
        // FUTURE
        // =========================================
        Future<String> future = executorService.submit(paymentTask);
        System.out.println("Task submitted");

        // =========================================
        // FUTURE - isDone()
        // =========================================
        while (!future.isDone()) {
            System.out.println("Waiting task execution...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // =========================================
        // FUTURE - get()
        // =========================================
        try {
            String result = future.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            System.out.println(e.getMessage());
        }

        // =========================================
        // FUTURE - Timeout
        // =========================================
        Future<String> timeoutTask = executorService.submit(() -> {
            Thread.sleep(5000);
            return "Long task completed";
        });

        try {
            System.out.println("Trying get with timeout...");
            String timeoutResult = timeoutTask.get(2, TimeUnit.SECONDS);
            System.out.println(timeoutResult);
        } catch (TimeoutException e) {
            System.out.println("Timeout while waiting task");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            System.out.println(e.getMessage());
        }

        // =========================================
        // FUTURE - Cancel
        // =========================================
        Future<String> cancelTask = executorService.submit(() -> {
            Thread.sleep(10000);
            return "Never completed";
        });

        boolean cancelled = cancelTask.cancel(true);
        System.out.println("Task cancelled: " + cancelled);

        // =========================================
        // SHUTDOWN
        // =========================================
        executorService.shutdown();
        System.out.println("Executor finalized");
    }

}
