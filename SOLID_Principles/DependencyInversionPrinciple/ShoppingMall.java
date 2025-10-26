package SOLID_Principles.DependencyInversionPrinciple;

import SOLID_Principles.SingleResponsibilityPrinciple.BankService;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard){
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard = new CreditCard();
        BankCard bankCard1 = new DebitCard();

        bankCard.doTransaction(500);
        bankCard1.doTransaction(1000);

    }
    
}
