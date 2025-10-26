package Design_Patterns.CreationalPatterns.FactoryPattern;

public class IntroModule extends Module {

    @Override
    public Module getModule() {
        System.out.println("Intro of Module added");
        return this;
    }

}
