package OOPS.Inheritance.Interfaces;

interface Displayable
{
    default void show()
    {
        System.out.println("Displayable.show() called");
    }
}

interface Printable
{
    default void show()
    {
        System.out.println("Printable.show() called");
    }
}

public class InterfaceAmbiguity implements Displayable,Printable //error Duplicate default methods named show with the parameters () and () are inherited from the types Printable and DisplayableJava(67109917)
{
     // Implement the show() method to resolve ambiguity
     @Override
     public void show() {
         Displayable.super.show();  // Calls show() from Displayable
         Printable.super.show();    // Calls show() from Printable
     }
     public static void main(String[] args) 
    {
        InterfaceAmbiguity obj = new InterfaceAmbiguity();
        obj.show();
    }
}

