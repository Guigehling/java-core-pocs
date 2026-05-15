import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceApp {

    public static void main(String[] args) {

        // =========================================
        // EXECUTOR
        // =========================================
        System.out.println("--- START EXECUTOR ---");
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // =========================================
        // RUNNABLE
        // =========================================

        Runnable task01 = (Runnable) () -> {
            System.out.println(Thread.currentThread().getName() + " processing task 01");
        };

        Runnable task02 = (Runnable) () -> System.out.println(Thread.currentThread().getName() + " processing task 02");

        System.out.println("--- RUNNABLE TASKS ---");
        executor.submit(task01);
        executor.submit(task02);

        // =========================================
        // CALLABLE
        // =========================================

        Callable<String> paymentProcess = () -> {
            Thread.sleep(3000);
            return "Payment processed!";
        };

        Future<String> paymentFuture = executor.submit(paymentProcess);

        try {
            String response = paymentFuture.get();
            System.out.println("--- CALLABLE TASKS ---");
            System.out.println(response);
        } catch (ExecutionException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // =========================================
        // CALLABLE - invokeAll
        // =========================================

        List<Callable<Integer>> callableList = List.of(
                () -> {
                    Thread.sleep(1000);
                    return 10;
                },
                () -> {
                    Thread.sleep(1500);
                    return 15;
                },
                () -> {
                    Thread.sleep(2000);
                    return 20;
                }
        );

        try {
            List<Future<Integer>> futureList = executor.invokeAll(callableList);

            for (Future<Integer> future : futureList) {
                System.out.println(future.get() + " seconds");
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            System.out.println(e.getMessage());
        }

        // =========================================
        // CALLABLE - invokeAny
        // =========================================

        List<Callable<String>> providerTasks = List.of(
                () -> {
                    Thread.sleep(3000);
                    return "Provider A responded";
                },
                () -> {
                    Thread.sleep(1000);
                    return "Provider B responded";
                },
                () -> {
                    Thread.sleep(2000);
                    return "Provider C responded";
                }
        );

        try {
            String fastestProvider = executor.invokeAny(providerTasks);
            System.out.println("First response: " + fastestProvider);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            System.out.println(e.getMessage());
        }

        // =========================================
        // SHOUTDOWN
        // =========================================
        executor.shutdown();

        System.out.println("--- SHOUTDOWN EXECUTOR ---");

        // =========================================
        // SCHEDULED-EXECUTOR
        // =========================================

        System.out.println("--- START SCHEDULED EXECUTOR ---");

        ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(1);

        System.out.println("Pre-processing integration status at: " + java.time.LocalTime.now());

        Runnable scheduledTask = () ->
                System.out.println("Processing integration status at: " + java.time.LocalTime.now());

        scheduledExecutor.schedule(scheduledTask, 3, TimeUnit.SECONDS);

        ScheduledFuture<?> fixedRateTask = scheduledExecutor.scheduleAtFixedRate(
                () -> System.out.println("Heartbeat: " + java.time.LocalTime.now()),
                1,
                2,
                TimeUnit.SECONDS
        );

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        fixedRateTask.cancel(true);

        scheduledExecutor.shutdown();

        System.out.println("--- SHUTDOWN SCHEDULED EXECUTOR ---");

    }


}
