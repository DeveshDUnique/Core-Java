public class Inheritance2 extends Inheritance1

{
    Inheritance2()
    {
        super();  //Using super statement, we can call any constructor of super class from constructor of subclass.
    }
    public int mul(int num1, int num2)
    {
        return num1 * num2;
    }

    public int div(int num1,int num2)
    {
        return num1/num2;
    }
}
