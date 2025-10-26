package OOPS.Inheritance.Interfaces;

/*// functional interface has only single abstract method */
@FunctionalInterface
interface AA{
    public void display(); //SAM

}

@FunctionalInterface
interface BB{
    public void bc(); //SAM

    default void defaultMethod(){
        System.out.println("We can have default methods in the functional interface");
    }

    default void defaultMethod2(){
        System.out.println("We can have n number of default methods in the interface");
    }
}


public class InterfaceFunctional1 implements BB,AA {

    @Override
    public void display() //Single abstract method (SAM) of functional interface AA implemented.
    {
        System.out.println("This is single abstract method in Functional interface AA");
    }

    @Override
    public void bc() //Single abstract method (SAM) of functional interface BB implemented.
    {
        System.out.println("This is abstract method in the interface BB");
    }

    public static void main(String[] args) {
        BB b = new InterfaceFunctional1(); // interface BB reference b referring to the class named InterfaceFunctional1.
        b.bc(); // calling the abstract method in interface BB
        b.defaultMethod(); // default methods in interface BB
        b.defaultMethod2(); 


        AA a = new InterfaceFunctional1();
        a.display();
    }


    
}
