class A
{
    public void show()
    {
        System.out.println("In class A");
    }
}


public class anonymous_inner_class 
{
    public static void main(String args[])
    {
        // A a = new A();
        // a.show(); // Here the above class A method void will be called.

        A obj = new A()  // declaration of anonymous inner class
        {
            public void show()
            {
                System.out.println("Anonymous_Inner_class");
            }
        };       
        obj.show(); 
    }    
}





