package SOLID_Principles.DependencyInversionPrinciple;

public class CreditCard implements BankCard{

    @Override
    public void doTransaction(long amount) {
        System.out.println("Paying via creditCard for amout = "+ amount);
    }
    
}
