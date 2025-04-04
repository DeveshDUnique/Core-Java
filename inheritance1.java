public class Inheritance1 
{
    public static int fld = 20;  // static field in super-class Inheritance

    Inheritance1()
    {
        System.out.println("Inheritance1 constructor called!");
    }

    public static void superMethod()
    {
        System.out.println("This is static method declared in the super class");
    }

    public int add(int num1, int num2)
    {
        return num1 + num2;
    }
    
    public int sub(int num1, int num2)
    {
        return num1 - num2;
    }
}
