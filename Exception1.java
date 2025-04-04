import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 
{
    public static void main(String[] args) 
    {
        Double result = 0.0;
        
            try (Scanner sc = new Scanner(System.in))
            {
                System.out.println("Enter 1st numerator for division");
                int number1 = sc.nextInt();
                System.out.println("Enter 2nd denomanator for division");
                int number2 = sc.nextInt();

                result = (double) (number1/number2);
                System.out.println(result);
            }
                  
        catch(ArithmeticException | InputMismatchException exception)
        {
            if (exception instanceof ArithmeticException)
            {
                System.out.println("Arithmetic Exception, Divide by 0 not possible, Enter another number");
            }
            else
            {
                System.out.println("Enter Integer number only and not another values");
            }
        }
    }
}
