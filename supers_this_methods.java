class A extends Object
{
    public A()
    {
        System.out.println(("In A"));
    }

    public A(int y)
    {   super();
        System.out.println("In prameterised A constructor");
    }
}

class B extends A
{
    public B()
    {
        System.out.println(("In B"));
    }
    public B(int b)
    {
        //super(b);  //by passing integer in super method it will call the public A(int y) constructor
        this(); // it will execute the constructor of same class
        System.out.println("In prameterised B constructor");
    }
}


public class supers_this_methods 
{
 public static void main(String args[])
 {
    //B obj = new B();
    B obj = new B(9);
   // A obj1 = new A();
 } 

}











