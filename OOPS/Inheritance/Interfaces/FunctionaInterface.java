package OOPS.Inheritance.Interfaces;

@FunctionalInterface
public interface FunctionaInterface {

    // Only one abstract method in the functional interface
    public abstract void onlyOneAbstract();

    //default method allowed in the functional interface
    default void defaultMethod(){
        System.out.println("Default method allowed in the functional interface");
    }

    //static method in the functional interface
    static void staticMethod(){
        System.out.println("This is static method");
    }

}
