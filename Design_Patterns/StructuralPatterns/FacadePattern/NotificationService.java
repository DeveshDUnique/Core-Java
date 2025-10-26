package Design_Patterns.StructuralPatterns.FacadePattern;

public class NotificationService {
    public void sendBookingConfirmation(String user, String movieName) {
        System.out.println("Confirmation sent to " + user + " for movie: " + movieName);
    }

}
