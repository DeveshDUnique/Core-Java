package Design_Patterns.CreationalPatterns.FactoryPattern;

public class DemoModule extends Module{

    @Override
    public Module getModule() {
        System.out.println("Demo of module added");
        return this;
    }

}
