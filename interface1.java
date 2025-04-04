interface computer
{
     public void code();
    
}

class laptop implements computer
{
    public void code()
    {
        System.out.println("code,compile,run.......");
    }
}

class desktop implements computer
{
    public void code()
    {
        System.out.println("code,compile,runfaster.......");
    }
}

class developer
{
    public void devApp(computer obj)
    {
        obj.code();
    }
}

public class interface1 
{
    public static void main(String args[])
    {
        computer lap = new laptop(); // laptop class object created
        computer des = new desktop();
        developer dp = new developer();  // developer class object created.
        dp.devApp(lap);
        dp.devApp(des);
    }
    
}





