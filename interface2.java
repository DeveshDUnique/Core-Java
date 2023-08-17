interface  A
{
    // by default in interface the variables are final(constant) and static
    int age = 14;   
    String tech = "java";

    void show();
    void config();
}

class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
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
        
        System.out.println(A.age);
        System.out.println(A.tech);

        //A.tech = "js";  cannot change the constant variables
    }
}









