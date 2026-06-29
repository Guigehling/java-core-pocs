package benchmark;

import java.util.concurrent.Executors;

public class ThreadingBenchmarkApp {

    // =========================================
    // THREAD POOL vs VIRTUAL THREADS
    // =========================================

    static void main(String[] args) throws Exception {
        runVirtualThreads();
        runPlatformThreads();
    }

    static void runVirtualThreads() throws Exception {

        long start = System.currentTimeMillis();

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 0; i < 1000; i++) {
                executor.submit(() -> {
                    Thread.sleep(10);
                    return null;
                });
            }
        }

        System.out.println("Virtual Threads: " +
                (System.currentTimeMillis() - start) + "ms");
    }

    static void runPlatformThreads() throws Exception {

        long start = System.currentTimeMillis();

        try (var executor = Executors.newFixedThreadPool(100)) {

            for (int i = 0; i < 1000; i++) {
                executor.submit(() -> {
                    Thread.sleep(10);
                    return null;
                });
            }
        }

        System.out.println("Platform Threads: " +
                (System.currentTimeMillis() - start) + "ms");
    }


}
