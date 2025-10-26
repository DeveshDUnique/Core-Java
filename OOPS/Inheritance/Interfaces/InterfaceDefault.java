package OOPS.Inheritance.Interfaces;

interface default1{
    public static int fld =10;  // fields declared in the interface are public static final

    default void foo() // can have default methods
    {
        System.out.println("this is default method in the Interface");

    }

    public void abstracts(); // can have abstract methods.

}

public class InterfaceDefault implements default1 {

    // @Override
    // public void foo() {
    //     default1.super.foo();
    // }

        @Override
    public void abstracts() {
        System.out.println("implemented the absttract method declared in the default1 interface");
    }
    

    public static void main(String[] args) {
        InterfaceDefault id = new InterfaceDefault();
       // fld = 20; // it is final field
        System.out.println( "static field in the interface = " +fld);
        id.foo();
        id.abstracts();
    }






   
}
