package Design_Patterns.CreationalPatterns.FactoryPattern;

public class SummaryModule extends Module{

    @Override
    public Module  getModule() {
        System.out.println("Summary of module added");
        return this;
    }

}
