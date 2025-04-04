///Equals , hashcode implementation
import java.util.Objects; // Required for Objects.hash()

public class Date 
{
    int day,month,year;


    Date()
    {
        this(01,01,2000);
    }
    Date(int day,int month,int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj)
    {
      if (this == obj) // check if references are equal then same object
      {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) // ensure object is not null and is of the same class
     {
        return false;
      }

      Date other  = (Date) obj; //downcasting
      return day == other.day && month == other.month && year == other.year; // Compare field values
    }
   

    @Override
    public int hashCode() 
    {
        return Objects.hash(day, month, year); // Use all fields involved in equals()
    }

    public static void main(String[] args) 
    {
        Date d1 = new Date(2,2,2002);
        Date d2 = new Date(12, 02, 2002);


       System.out.println( d1.equals(d2)); // checks the equality of objects

       System.out.println(d1 == d2); // checks the equality of references

       System.out.println("d1 hashcode- " + d1.hashCode());
	     System.out.println("d2 hashcode- " + d2.hashCode());
    }

}
