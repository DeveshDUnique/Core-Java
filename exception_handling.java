public class exception_handling 
{
    public static void main(String args[])
    {
        try
        {
        int i = 0;
        int j = 9;

        System.out.println(j/i);  //ArithmeticException: cannot divide by 0
        }
        catch(Exception e)
        {
            System.out.println("check if you are dividing number by zero");
        }
    }    
}
