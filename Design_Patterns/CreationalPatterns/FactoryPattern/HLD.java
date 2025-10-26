package Design_Patterns.CreationalPatterns.FactoryPattern;

public class HLD extends Course{
    

    @Override
    public void createCourse() {
        SummaryModule summaryModule = new SummaryModule();
        IntroModule introModule = new IntroModule();
        DemoModule demoModule = new DemoModule();
        modules.add(introModule.getModule());
        modules.add(demoModule.getModule());
        modules.add(summaryModule.getModule());
        
    }
    

    
}