void main(String[] args) throws Exception {

    // =========================================
    // VIRTUAL THREADS (LOOM)
    // =========================================
    try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {

        // =========================================
        // CREATE TASKS
        // =========================================
        for (int i = 0; i < 10; i++) {
            int id = i;

            executor.submit(() -> {
                System.out.println("Task " + id + " -> " + Thread.currentThread());

                Thread.sleep(500);

                return id;
            });
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
    }
}