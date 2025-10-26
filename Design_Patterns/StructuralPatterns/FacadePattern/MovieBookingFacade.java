package Design_Patterns.StructuralPatterns.FacadePattern;

public class MovieBookingFacade {
    private MovieService movieService = new MovieService();
    private SeatService seatService = new SeatService();
    private PaymentService paymentService = new PaymentService();
    private NotificationService notificationService = new NotificationService();

    public void bookTicket(String user, String movieName, int seat, double amount) {
        System.out.println("----- Booking Started -----");
        String details = movieService.getMovieDetails(movieName);
        System.out.println(details);

        boolean seatReserved = seatService.reserveSeat(movieName, seat);
        if (!seatReserved) {
            System.out.println("Seat booking failed!");
            return;
        }

        boolean paymentDone = paymentService.makePayment(user, amount);
        if (!paymentDone) {
            System.out.println("Payment failed!");
            return;
        }

        notificationService.sendBookingConfirmation(user, movieName);
        System.out.println("----- Booking Completed -----");
    }



}
