import java.util.Objects;

public class Dates 
{
    int day,month,year;

    Dates()
    {
        this(01,01,2000);
    }
    Dates(int day,int month,int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) { // check if the reference is of the same class
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) { //check  null and of same class
            return false;
        }
        Dates dt = (Dates) obj; // downcasting

        return day == dt.day && month == dt.month && year == dt.year; 
    }

    /*Consequences Summary of Not Overriding hashCode() When Overriding equals():

Violates the equals()/hashCode() contract.
Hash-based collections (HashSet, HashMap, etc.) will behave incorrectly.
 You might get duplicate entries in a HashSet when you shouldn't, or you might not be able to retrieve values
  from a HashMap using keys that are considered equal by equals().
Breaks general expectations of object equality in Java.
The Fix: Always Override hashCode() When You Override equals() 
*/
    @Override
    public int hashCode()
    {
        return Objects.hash(day,month,year);
    }

}
