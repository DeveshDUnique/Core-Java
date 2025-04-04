package Exceptions;

public class CheckedExceptionTime
{

    public static void main(String[] args) 
    {
        
    Time t1 = new Time();

    try
    {
        t1.setHours(25);
    }
    catch(InvalidTimeException ie)
    {
        ie.printStackTrace();
    }

    }
    
}
