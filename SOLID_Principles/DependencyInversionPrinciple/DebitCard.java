package SOLID_Principles.DependencyInversionPrinciple;

public class DebitCard implements BankCard {

    @Override
    public void doTransaction(long amount) {
        
        System.out.println("Paying via DebitCard for amount = "+ amount);
    }
    
}
