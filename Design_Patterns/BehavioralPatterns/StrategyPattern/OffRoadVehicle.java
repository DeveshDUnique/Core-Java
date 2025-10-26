package Design_Patterns.BehavioralPatterns.StrategyPattern;

public class OffRoadVehicle extends Strategy{

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
    
}
