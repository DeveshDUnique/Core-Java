package OOPS.Inheritance.Interfaces;

// class to class -> extends
// class - interface -> implements
// interface to interface - > extends

interface  A
{
    // by default in interface the fields are public static final.
    int age = 14;   
    String tech = "java";

    void show();
    void config();
}

interface X
{
    void run();
    
}

interface Y extends X
{

}

class B implements A,Y
{
    
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
    public void run()
    {
        System.out.println("in X- run");
    }
}

public class interface2 
{
    public static void main(String args[])
    {
        

        A obj;
        obj = new B() ;
        obj.show();
        obj.config();

        // A.age = 15;  // cannot change the final field.
        
        System.out.println(A.age);
        System.out.println(A.tech);

        //A.tech = "js";  cannot change the constant variables

        X obj1 = new B();
        obj1.run();
    }
}









