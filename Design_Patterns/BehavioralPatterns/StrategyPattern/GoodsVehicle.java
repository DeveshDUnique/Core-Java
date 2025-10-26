package Design_Patterns.BehavioralPatterns.StrategyPattern;

public class GoodsVehicle extends Strategy{

    GoodsVehicle() {
        super(new NormalDriveStrategy());
        
    }
    
    
}
