package Design_Patterns.BehavioralPatterns.StrategyPattern;

public class Main {

    public static void main(String[] args) {
        Strategy strategy = new GoodsVehicle();
        strategy.drive();
    }
    
}



