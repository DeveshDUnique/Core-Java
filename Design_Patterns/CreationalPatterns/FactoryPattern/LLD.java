package Design_Patterns.CreationalPatterns.FactoryPattern;

public class LLD extends Course{

    @Override
    public void createCourse() {
        SummaryModule summaryModule = new SummaryModule();
        DemoModule demoModule = new DemoModule();
        IntroModule introModule = new IntroModule();
        modules.add(introModule.getModule());
        modules.add(demoModule.getModule());
        modules.add(summaryModule.getModule());
        
    }
}
