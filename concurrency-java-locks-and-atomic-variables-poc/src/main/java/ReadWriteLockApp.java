import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockApp {

    private static final ReadWriteLock lock =
            new ReentrantReadWriteLock();

    private static int sharedValue = 0;

    public static void main(String[] args)
            throws InterruptedException {

        ExecutorService executor =
                Executors.newFixedThreadPool(5);

        Runnable readerTask = () -> {

            lock.readLock().lock();

            try {

                System.out.println(
                        LocalTime.now()
                                + " | "
                                + Thread.currentThread().getName()
                                + " READING value: "
                                + sharedValue
                );

                Thread.sleep(3000);

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();

            } finally {

                System.out.println(
                        Thread.currentThread().getName()
                                + " FINISHED READING"
                );

                lock.readLock().unlock();
            }
        };

        Runnable writerTask = () -> {

            lock.writeLock().lock();

            try {

                sharedValue++;

                System.out.println(
                        "\n"
                                + LocalTime.now()
                                + " | "
                                + Thread.currentThread().getName()
                                + " WRITING value: "
                                + sharedValue
                );

                Thread.sleep(3000);

            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();

            } finally {

                System.out.println(
                        Thread.currentThread().getName()
                                + " FINISHED WRITING\n"
                );

                lock.writeLock().unlock();
            }
        };

        // =========================================
        // MULTIPLE READERS
        // =========================================

        executor.submit(readerTask);
        executor.submit(readerTask);
        executor.submit(readerTask);

        // força tempo para readers entrarem juntos
        Thread.sleep(500);

        // =========================================
        // WRITER
        // =========================================

        executor.submit(writerTask);

        // =========================================
        // NEW READER
        // =========================================

        executor.submit(readerTask);

        executor.shutdown();

        executor.awaitTermination(
                20,
                TimeUnit.SECONDS
        );

        System.out.println("\nApplication finalized.");
    }
}