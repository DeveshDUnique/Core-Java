package Exceptions;

public class UncheckedExceptionDate 
{
    public static void main(String[] args) 
    {
        Date d1 = new Date();
        try{
            d1.setDay(0);
        }
        catch(InvalidDateException id)
        {
            id.printStackTrace();
        }
        
    }
    
}
