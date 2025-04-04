
import java.util.Calendar;

public class Calenders 

{
    public static void main(String[] args) {
        
    Calendar calendar = Calendar.getInstance(); // getting the instance of day, month and year

    int day = calendar.get(Calendar.DAY_OF_MONTH);
    int month = calendar.get(Calendar.MONTH);
    int year = calendar.get(Calendar.YEAR);

    System.out.println("Date = " +day + "-"+month+"-"+year);
    
    }
    
    
}
