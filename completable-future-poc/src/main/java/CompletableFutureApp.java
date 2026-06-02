import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureApp {

    public static void main(String[] args) {

        // =========================================
        // RUN ASYNC
        // =========================================
        try {

            CompletableFuture<Void> runAsync = CompletableFuture.runAsync(() ->
                    System.out.println("Running async task...")
            );

            runAsync.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        // =========================================
        // SUPPLY ASYNC
        // =========================================
        CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> "Integration completed");

        System.out.println(supplyAsync.join());

        // =========================================
        // THEN APPLY
        // =========================================
        CompletableFuture<String> thenApply = CompletableFuture
                .supplyAsync(() -> "Then Apply Test")
                .thenApply(String::toUpperCase);

        System.out.println(thenApply.join());

        // =========================================
        // THEN ACCEPT
        // =========================================
        CompletableFuture
                .supplyAsync(() -> 5000.0)
                .thenAccept(value -> System.out.println("Payment processed: " + value))
                .join();

        // =========================================
        // THEN RUN
        // =========================================
        CompletableFuture
                .runAsync(() -> System.out.println("Saving contract..."))
                .thenRun(() -> System.out.println("Notification sent!"))
                .join();

        // =========================================
        // COMBINE FUTURES
        // =========================================
        CompletableFuture<String> firstName = CompletableFuture.supplyAsync(() -> "Guilherme");

        CompletableFuture<String> lastName = CompletableFuture.supplyAsync(() -> "Gehling");

        CompletableFuture<String> fullName = firstName.thenCombine(
                lastName, (first, last) -> first + " " + last
        );

        System.out.println(fullName.join());

        // =========================================
        // ALL OF
        // =========================================
        CompletableFuture<Void> allOf = CompletableFuture.allOf(
                CompletableFuture.runAsync(() -> System.out.println("Task 1")),
                CompletableFuture.runAsync(() -> System.out.println("Task 2")),
                CompletableFuture.runAsync(() -> System.out.println("Task 3"))
        );

        allOf.join();

        // =========================================
        // ANY OF
        // =========================================
        CompletableFuture<Object> anyOf = CompletableFuture.anyOf(
                CompletableFuture.supplyAsync(() -> {
                    sleep(2);
                    return "API 1";
                }),

                CompletableFuture.supplyAsync(() -> {
                    sleep(1);
                    return "API 2";
                })
        );

        System.out.println("First response: " + anyOf.join());

        // =========================================
        // EXCEPTIONALLY
        // =========================================
        CompletableFuture<String> exceptionally = CompletableFuture
                .<String>supplyAsync(() -> {
                    throw new RuntimeException("Integration error");
                })
                .exceptionally(error -> {
                    System.out.println(error.getMessage());
                    return "Fallback response";
                });

        System.out.println(exceptionally.join());

        // =========================================
        // HANDLE
        // =========================================
        CompletableFuture<String> handle = CompletableFuture
                .<String>supplyAsync(() -> {
                    throw new RuntimeException("Error processing");
                })
                .handle((response, error) -> {
                    if (error != null) {
                        return "Default value";
                    }

                    return response;
                });

        System.out.println(handle.join());

        // =========================================
        // CUSTOM DELAY
        // =========================================
        CompletableFuture<String> delayed = CompletableFuture
                .supplyAsync(() -> {
                    sleep(2);
                    return "Delayed response";
                });

        System.out.println(delayed.join());

        System.out.println("Application finalized.");
    }


    private static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
