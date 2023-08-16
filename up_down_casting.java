class A
{
    public void show1()
    {
        System.out.println("in class a");
    }
}


class B extends A
{
    public void show2()
    {
        System.out.println("in class b");
    }
}


public class up_down_casting 
{
    public static void main(String args[])
    {
        double d = 3.6;
        int i = (int)d;
        System.out.println(i);



        A obj = (A)new B();  // upcasting the reference of B object obj to A
        obj.show1();
        
        B ob  = (B) obj;   // downcasting the reference of A object obj to B reference

        ob.show2();

    }
}
