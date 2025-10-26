package OOPS.Abstraction;
public abstract class AbstractClass1 { // abstract class defined.
    //static field- class variables
    static String staticField ="HelloWorld";
    //non-static fields - Instance variables
    int nonStaticField;

    //constructor
    public AbstractClass1(int num)
    {
        this.nonStaticField = num;
        System.out.println("nonStaticField has been instantiated as = " + nonStaticField + " in superClass constructor");
    }

    // abstract method can only be defined in abstract class
    public abstract void abstractMethod();

     // Non-abstract method: Abstract classes can have fully implemented methods.
     public void nonAbstractMethod() {
        System.out.println("This is a non-abstract method in an abstract class.");
    }

}
