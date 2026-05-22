import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class JavaLocksApp {

    private static int unsafeCounter = 0;
    private static int safeCounter = 0;
    private static int synchronizedCounter = 0;

    private static final ReentrantLock lock = new ReentrantLock();

    private static synchronized void incrementSynchronized() {
        synchronizedCounter++;
    }

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // =========================================
        // UNSAFE COUNTER
        // =========================================
        for (int i = 0; i < 1000; i++) {
            executorService.submit(() -> unsafeCounter++);
        }

        // =========================================
        // SYNCHRONIZED COUNTER
        // =========================================
        for (int i = 0; i < 1000; i++) {
            executorService.submit(JavaLocksApp::incrementSynchronized);
        }

        // =========================================
        // LOCK COUNTER
        // =========================================
        for (int i = 0; i < 1000; i++) {
            executorService.submit(() -> {

                lock.lock();
                try {
                    safeCounter++;
                } finally {
                    lock.unlock();
                }

            });
        }

        System.out.println("Unsafe counter: " + unsafeCounter);
        System.out.println("Synchronized counter: " + synchronizedCounter);
        System.out.println("Lock counter: " + safeCounter);


        // =========================================
        // LOCK - TryLock()
        // =========================================
        if (lock.tryLock()) {
            try {
                System.out.println("Lock acquired");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Could not acquire lock");
        }


        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
    }

}
