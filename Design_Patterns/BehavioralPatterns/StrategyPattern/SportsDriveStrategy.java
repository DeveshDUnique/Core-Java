package Design_Patterns.BehavioralPatterns.StrategyPattern;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Sports drive strategy");
    }
    

}
