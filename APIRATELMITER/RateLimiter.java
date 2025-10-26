package APIRATELMITER;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/*
 * A simple, easy-to-understand rate limiter for tracking requests from IP addresses.
 * This class is designed to be thread-safe.
 */
public class RateLimiter {

    // These constants define the rate limit rules.
    private static final int REQUEST_LIMIT = 10; // Max requests allowed
    private static final long TIME_WINDOW_IN_SECONDS = 60; // In a 60-second window

    // We use a HashMap to store request records for each IP address.
    // Key: The IP address (String)
    // Value: A Queue of timestamps (in milliseconds) for each request from that IP.
    private final Map<String, Queue<Long>> requests;

    public RateLimiter() {
        this.requests = new HashMap<>();
    }

    /**
     * Checks if a request from a specific IP is allowed.
     * This method is 'synchronized' to ensure that it works correctly even when
     * multiple requests arrive at the exact same time (thread-safety).
     *
     * @param ipAddress The IP address making the request.
     * @return true if the request is allowed, false if it is denied.
     */
    public synchronized boolean isAllowed(String ipAddress) {
        // Get the current time in milliseconds.
        long currentTime = System.currentTimeMillis();
        
        // Get the queue of past request timestamps for this IP.
        // If we've never seen this IP before, create a new empty queue for it.
        Queue<Long> timestamps = requests.computeIfAbsent(ipAddress, k -> new LinkedList<>());

        // The start of our 1-minute time window.
        long windowStartTime = currentTime - (TIME_WINDOW_IN_SECONDS * 1000);

        // --- The "Sliding Window" Logic ---
        // Remove any timestamps from the front of the queue that are now
        // older than our 1-minute window.
        while (!timestamps.isEmpty() && timestamps.peek() < windowStartTime) {
            timestamps.poll(); // .poll() removes the oldest item from the queue.
        }

        // --- Check the Limit ---
        // After removing old timestamps, check if the queue size is still under the limit.
        if (timestamps.size() < REQUEST_LIMIT) {
            // If the limit is not reached, this request is allowed.
            // Add the current request's timestamp to the queue.
            timestamps.add(currentTime);
            return true;
        } else {
            // If the queue has 10 or more timestamps, the limit is reached.
            // Deny the request.
            return false;
        }
    }
    
    /**
     * A main method to demonstrate how the RateLimiter works.
     */
    public static void main(String[] args) throws InterruptedException {
        RateLimiter limiter = new RateLimiter();

        String ipAddress1 = "192.168.1.100";
        String ipAddress2 = "10.0.0.5";

        System.out.println("--- Simulating rapid requests from IP: " + ipAddress1 + " ---");
        
        // Simulate 12 quick requests from the same IP.
        // The first 10 should be allowed, and the next 2 should be blocked.
        for (int i = 0; i < 12; i++) {
            boolean allowed = limiter.isAllowed(ipAddress1);
            System.out.println("Request #" + (i + 1) + ": " + (allowed ? "Allowed" : "Denied"));
            Thread.sleep(100); // Small delay between requests
        }

        System.out.println("\n--- A request from a different IP should be allowed ---");
        boolean allowedForIp2 = limiter.isAllowed(ipAddress2);
        System.out.println("Request from " + ipAddress2 + ": " + (allowedForIp2 ? "Allowed" : "Denied"));

        System.out.println("\n--- Waiting for 60 seconds for the window to reset... ---");
        Thread.sleep(60 * 1000);

        System.out.println("\n--- Trying again from IP: " + ipAddress1 + " after waiting ---");
        // After waiting a minute, the old requests have expired, so a new one is allowed.
        boolean allowedAfterWaiting = limiter.isAllowed(ipAddress1);
        System.out.println("New request from " + ipAddress1 + ": " + (allowedAfterWaiting ? "Allowed" : "Denied"));
    }
}

