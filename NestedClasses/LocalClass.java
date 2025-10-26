package NestedClasses;
/*Like local variables of a method.
The class scope is limited to the enclosing method.
If enclosed in static method, behaves like static member class. If enclosed in non-static method, behaves like non-static member class.
Along with Outer class members, it can also access (effectively) final local variables of the enclosing method.
We can create any number of objects of local classes within the enclosing method. */
public class LocalClass {
    private int nonStaticField = 10;
    private static int staticField = 20;
    public static void main(String[] args) {
    final int localVar1 = 1;
    int localVar2 = 2;
    int localVar3 = 3;
    localVar3++;
    // local class inner (in static method) -- behave like static member class
    class InnerLocalClass {
        public void display() {
          //  System.out.println("Outer.nonStaticField = " + nonStaticField); // error
            System.out.println("Outer.staticField = " + staticField); // ok 20
            System.out.println("LocalClass.localVar1 = " + localVar1); // ok 1
            System.out.println("LocalClass.localVar2 = " + localVar2); // ok 2
            System.out.println("LocalClass.localVar3 = " + localVar3); // error
            }  
    }
    InnerLocalClass ic = new InnerLocalClass();
    ic.display();
    
}
}
