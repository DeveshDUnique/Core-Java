package Design_Patterns.BehavioralPatterns.StrategyPattern;

public class Strategy {

    DriveStrategy driveStrategy;

    Strategy(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
    
}

