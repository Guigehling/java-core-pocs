import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadApp {

    public static void main(String[] args) throws InterruptedException {

        // =========================================
        // SINGLE VIRTUAL THREAD
        // =========================================
        Thread virtualThread = Thread.startVirtualThread(() ->
                System.out.println("Running virtual thread: " + Thread.currentThread())
        );

        virtualThread.join();

        // =========================================
        // MULTIPLE VIRTUAL THREADS
        // =========================================
        List<Thread> virtualThreads = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int taskId = i;

            Thread thread = Thread.startVirtualThread(() ->
                    System.out.println("Task " + taskId +
                            " executed by " + Thread.currentThread())
            );

            virtualThreads.add(thread);
        }

        for (Thread thread : virtualThreads) {
            thread.join();
        }

        // =========================================
        // VIRTUAL THREAD EXECUTOR
        // =========================================
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 1; i <= 5; i++) {
                int taskId = i;

                executor.submit(() -> {
                    System.out.println("Processing task " + taskId);
                    Thread.sleep(1000);
                    return taskId;
                });
            }
        }

        // =========================================
        // MASSIVE CONCURRENCY
        // =========================================
        long startTime = System.currentTimeMillis();

        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 1; i <= 10_000; i++) {
                int taskId = i;

                executor.submit(() -> {
                    Thread.sleep(100);
                    return taskId;
                });
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Finished in " + (endTime - startTime) + " ms");

        System.out.println("Application finalized.");
    }

}
