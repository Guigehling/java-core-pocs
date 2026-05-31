import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VirtualThreadHttpApp {

    private static final int TOTAL_REQUESTS = 100;
    private static final HttpClient CLIENT = HttpClient.newHttpClient();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("--- PLATFORM THREADS ---");
        executeWithPlatformThreads();

        System.out.println("--- VIRTUAL THREADS ---");
        executeWithVirtualThreads();
    }

    private static void executeWithPlatformThreads() throws InterruptedException {
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(10);

        submitRequests(executor);

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.MINUTES);

        long endTime = System.currentTimeMillis();

        System.out.println("Platform Threads Time: " + (endTime - startTime) + " ms");
    }

    private static void executeWithVirtualThreads() throws InterruptedException {
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        submitRequests(executor);

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.MINUTES);

        long endTime = System.currentTimeMillis();

        System.out.println("Virtual Threads Time: " + (endTime - startTime) + " ms");

    }

    private static void submitRequests(final ExecutorService executor) {
        for (int i = 1; i <= TOTAL_REQUESTS; i++) {
            int requestId = i;

            executor.submit(() -> {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                        .GET()
                        .build();

                HttpResponse<String> response = CLIENT.send(
                        request,
                        HttpResponse.BodyHandlers.ofString()
                );

                System.out.println("Request " + requestId + " -> Status " + response.statusCode());

                return response.statusCode();
            });
        }
    }

}
