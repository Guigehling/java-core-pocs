import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class AtomicVariablesApp {

    private static int unsafeCounter = 0;

    private static final AtomicInteger atomicCounter = new AtomicInteger(0);

    private static final LongAdder longAdder = new LongAdder();

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // =========================================
        // UNSAFE COUNTER
        // =========================================
        for (int i = 0; i < 1000; i++) {
            executorService.submit(() -> unsafeCounter++);
        }

        // =========================================
        // ATOMIC COUNTER
        // =========================================
        for (int i = 0; i < 1000; i++) {
            executorService.submit(atomicCounter::incrementAndGet);
        }

        // =========================================
        // LONG ADDER
        // =========================================
        for (int i = 0; i < 1000; i++) {
            executorService.submit(longAdder::increment);
        }

        System.out.println("Unsafe counter: " + unsafeCounter);
        System.out.println("Atomic lock: " + atomicCounter.get());
        System.out.println("LongAdder Counter: " + longAdder.longValue());


        // =========================================
        // COMPARE AND SET
        // =========================================
        AtomicInteger compareAndSet = new AtomicInteger(10);
        boolean updated = compareAndSet.compareAndSet(10, 20);

        System.out.println("CompareAndSet success: " + updated);
        System.out.println("CompareAndSet original value: " + compareAndSet.get());

        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);
    }

}
