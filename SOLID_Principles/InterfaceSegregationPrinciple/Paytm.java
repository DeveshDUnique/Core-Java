package SOLID_Principles.InterfaceSegregationPrinciple;

public class Paytm implements UpiPayments,CashBackManager {

    @Override
    public void getCashBack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCashBack'");
    }

    @Override
    public void payMoney() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'payMoney'");
    }

    @Override
    public void getScratchCard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getScratchCard'");
    }
    
    
}
