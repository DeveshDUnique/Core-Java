package Design_Patterns.StructuralPatterns.FacadePattern;

public class Main {

    public static void main(String[] args) {
        MovieBookingFacade facade = new MovieBookingFacade();
        facade.bookTicket("Dev","openhimer",15,300);
        
    }
    
}
