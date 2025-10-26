package OOPS.Abstraction;
abstract class A
{
     public abstract void show();
     public abstract void config();

} 



public class abstract_anonymous_inner_class 
{
    public static void main(String args[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In abstract new show");
            }

            
            public void config() 
            {
                System.out.println("In abstract new config");
            }

        };
        obj.show();
        obj.config();
    }    
}
