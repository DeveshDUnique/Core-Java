
@FunctionalInterface    //Conceptually, a functional interface has exactly one abstract method.
interface A
{
    public void show();
    
}


// class B implements A
// {
//     public void show()
//     {
//         System.out.println("in Show");
//     }
// }


public class interface_functional 
{
    public static void main(String args[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in Show");
            }
        };
        obj.show();
    }    
}








