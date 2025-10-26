package MultiThreading.StadiumSeatBooking;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import MultiThreading.StadiumSeatBooking.Seat;

public class SeatBooking {
    private final ConcurrentHashMap<Integer,Seat> seats = new ConcurrentHashMap<>();
   // private final Semaphore bookingSemaphore;

    
    public SeatBooking(int totalSeats, int maxParallelBookings){
    // initialize the seats
    for(int i=1;i<=totalSeats;i++){
        seats.put(i, new Seat(i));
    }
    }
    //atmost 4 parallel bookings
   //

    public void bookSeat(int seatNumber,String userId){
        //limiting the concurrent access
        Seat seat = seats.get(seatNumber);

        if (seat == null) {
            System.out.println("Seat "+seatNumber+" does not exist");
            return;
        }
        boolean success = seat.book(userId);
        if (!success) {
            System.out.println("Seat "+seatNumber+" alreadyBooked.");
            
        }
    }

    public static void main(String[] args) {
        SeatBooking seatBooking = new SeatBooking(100, 4);

        ExecutorService executor = Executors.newFixedThreadPool(20);

        //50 users trying to book ticket
        for(int i=1;i<=50;i++){
            int seatToBook = i % 100 +1;
            String userId = "User -> "+i;

            executor.submit(() -> seatBooking.bookSeat(seatToBook,userId));
        }
        executor.shutdown();
    }
}
