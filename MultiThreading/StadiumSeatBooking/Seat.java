package MultiThreading.StadiumSeatBooking;

import java.util.concurrent.locks.ReentrantLock;

public class Seat {
    private final int seatNumber;
    private boolean isBooked = false;
    private final ReentrantLock lock = new ReentrantLock();

    public Seat(int seatNumber){
        this.seatNumber = seatNumber;
    }

    public boolean book(String userID){
        lock.lock();
        try{
            if (isBooked) {
                return false;
            }else{
                isBooked = true;
                System.out.println("Seat "+seatNumber + " bookedby "+userID);
                return true;
            }
        }finally{
            lock.unlock();
        }

    }
    
}
