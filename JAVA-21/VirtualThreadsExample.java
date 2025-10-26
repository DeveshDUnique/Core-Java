
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/* NOTE : this will run on java 21 version only */

public class VirtualThreadsExample {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        int numberOfTasks = 10;

        System.out.println("Starting " + numberOfTasks + " virtual threads...");

        // Start virtual threads
        // Thread.ofVirtual().start(() -> { ... }); is also an option for single threads
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, numberOfTasks).forEach(i ->
                executor.submit(() -> {
                    try {
                        System.out.println("Thread " + i + " starting on virtual thread: " + Thread.currentThread());
                        Thread.sleep(Duration.ofSeconds(1)); // Simulate I/O bound operation
                        System.out.println("Thread " + i + " finished.");
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                })
            );
        } // Executor is closed automatically here, waiting for tasks to complete

        long endTime = System.currentTimeMillis();
        System.out.println("All threads finished in " + (endTime - startTime) + " ms.");
    }
}



