package OOPS.Inheritance.Interfaces;
//import A;

@FunctionalInterface    //Conceptually, a functional interface has exactly one abstract method.
interface A
{
    public abstract void show();
    
}

/* Examples of functional interfaces is are :->  */


// class B implements A
// {
//     public void show()
//     {
//         System.out.println("in Show");
//     }
// }


@FunctionalInterface // okay
interface Foo {
void foo(); // SAM
}

@FunctionalInterface // okay if we have default methods with SAM
interface FooBar1 {
void foo(); // SAM
default void bar()
 {
/*... */
}
default void foodbar()
{
    /*.... */
}
}
@FunctionalInterface // compiler error if we have more than one SAM.
interface FooBar2 
{
void foo(); // AM
void bar(); // AM
}


@FunctionalInterface // compiler error  as we have no SAM
interface FooBar3 
{
default void foo() 
{
/*... */
}
default void bar() 
{
/*... */
}
}


@FunctionalInterface // okay
interface FooBar4 {
void foo(); // SAM
public static void bar()
{
    System.out.println("static method");
}
}



public class interface_functional 
{
    public static void main(String args[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in Show");
            }
        };
        obj.show();
    }    
}








