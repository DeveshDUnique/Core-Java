class A
{

    public A()
    {
        System.out.println("Object Created");
    }


    public void show()
    {
        System.out.println("Show method");
    }
}



public class anonymous_object 
{
    public static void main(String args[])
    {
        // A obj = new A();
        // obj.show();

        new A(); // anonymous object
        new A().show();
    }
}

