package Design_Patterns.StructuralPatterns.FacadePattern;

public class PaymentService {
    public boolean makePayment(String user, double amount) {
        System.out.println("Payment of ₹" + amount + " successful for " + user);
        return true;
    }

}
