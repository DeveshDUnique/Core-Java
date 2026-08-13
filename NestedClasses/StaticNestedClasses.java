package NestedClasses;
/*Static member classes
Like other static members of the class (belong to the class, not the object).
Accessed using outer class (Doesn't need the object of outer class).
Can access static (private/public) members of the outer class directly.
Static member class cannot access non-static members of outer class directly.
The outer class can access all members (including private) of inner class directly (no need of getter/setter).
The static member classes can be private, public, protected, or default. */
public class StaticNestedClasses {
    private int nonStaticField = 10;
    static int staticField = 20;
    
    public static class InnerStaticNestedClasses {
        private static String st = "Hello";


        public void display() {
           // System.out.println("Outer.nonStaticField = " + nonStaticField); // error
            System.out.println("Outer.staticField = " + staticField); // ok - 20
            }  

        public static void displayStatic() {
            System.out.println("Outer.staticField = " + staticField); // ok - 20
        }
    }

    public static void main(String[] args) {

        StaticNestedClasses sn = new StaticNestedClasses();

        // System.out.println(obj.nonStaticField); // error - cannot access non-static field

        System.out.println(sn.nonStaticField);

        System.out.println(StaticNestedClasses.staticField); //accessing outerstatic field directly via class name.

        System.out.println(StaticNestedClasses.InnerStaticNestedClasses.st); //accessing inner static field directly via class name.

        StaticNestedClasses.InnerStaticNestedClasses.displayStatic(); //accessing innerclass static method directly via class name.


    }
}
