import OOPS.Inheritance.Interfaces.A;

public class demo1 
{
    public static void main(String args[])
    {


        A obj = new A();
        System.out.println(obj.marks);

        // System.out.println(obj.id); // protected variables
        // System.out.println(obj.roll_no); // private variables

        obj.show();

    }
}
