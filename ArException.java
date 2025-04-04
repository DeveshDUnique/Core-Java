public class ArException 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int result = 0;

        try{
            result = a/0;
        }
        catch(ArithmeticException ar)
        {
            System.out.println("Cannot divide by 0");
        }
        System.out.println("Execution successful");
    }
    
}
