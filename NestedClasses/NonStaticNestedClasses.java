package NestedClasses;
/*Non-static member classes/Inner classes
Like other non-static members of the class (belong to the object/instance of Outer class).
Accessed using outer class object (Object of outer class is MUST).
Can access static & non-static (private) members of the outer class directly.
The outer class can access all members (including private) of inner class directly (no need of getter/setter).
The non-static member classes can be private, public, protected, or default.
If Inner class member has same name as of outer class member, it shadows (hides) the outer class member. Such Outer class members can be accessed
explicitly using Outer.this. */
public class NonStaticNestedClasses {

    private int nonStaticField = 10;
    private static int staticField = 20;

    public class InnerClass{
        public void display() {
            System.out.println("Outer.nonStaticField = " + nonStaticField); // ok-10
            System.out.println("Outer.staticField = " + staticField); // ok-20
            }
    }


    public static void main(String[] args) {
        NonStaticNestedClasses.InnerClass obj = new NonStaticNestedClasses().new InnerClass();
        obj.display();
        
        
    }






    
}
