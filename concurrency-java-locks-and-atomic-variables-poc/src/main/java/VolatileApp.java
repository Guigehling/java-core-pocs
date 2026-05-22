public class VolatileApp {

    // =========================================
    // VOLATILE VARIABLE
    // =========================================
    private static volatile boolean running = true;

    // =========================================
    // NON VOLATILE VARIABLE
    // =========================================
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        // =========================================
        // THREAD MONITOR
        // =========================================
        Thread monitorThread = new Thread(() -> {
            System.out.println("Monitor thread started.");

            while (running) {
                counter++;
                System.out.println("Monitoring system... Counter: " + counter);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            System.out.println("\nMonitor thread finalized.");
        });
        monitorThread.start();

        // =========================================
        // MAIN THREAD
        // =========================================
        Thread.sleep(5000);
        System.out.println("Main thread changing running to false...");


        running = false;
        monitorThread.join();
        System.out.println("Application finalized.");
    }
}