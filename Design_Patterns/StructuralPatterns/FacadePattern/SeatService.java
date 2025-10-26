package Design_Patterns.StructuralPatterns.FacadePattern;

public class SeatService {
public boolean reserveSeat(String movieName, int seatNumber) {
        System.out.println("Seat " + seatNumber + " reserved for " + movieName);
        return true;
    }
}
