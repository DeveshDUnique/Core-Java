package Design_Patterns.CreationalPatterns.FactoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {

    public abstract void createCourse();

    protected List<Module> modules = new ArrayList<>();

    public Course(){
        this.createCourse();
    }

    public List<Module> getModules(){
        return modules;
    }

}
