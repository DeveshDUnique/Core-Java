package OOPS.Inheritance.Interfaces;

// when a interface contains only SAM- single abstract method then its called FunctionalInterface

@FunctionalInterface
interface FooBar
{
    void foo();  //sam
    
}

@FunctionalInterface
interface FooBar1
{
    default void fo()
    {
        System.out.println("default method in interface");
    }
    void foo();  //SAM
}

@FunctionalInterface
interface FooBar2
{
    void foo(); //SAM
    static void bar()
    {
        System.out.println("Static method allowed in FunctionalInterface");
    }
}

@FunctionalInterface
interface FooBar3
{
    void foo(); 
    void bar(); //two abstract methods not allowed in the Functional interbace only SAM
}

@FunctionalInterface
interface FooBar4
{
    default void foo()
    {

    }
    default void bar()  // two default methods  allowed in FunctionalInterface only if SAM is present.
    {

    }
    void sam();
}



public class InterfaceFunctional 
{
    
}
