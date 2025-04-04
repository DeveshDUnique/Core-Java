import java.util.Objects; // import the package for objects

public class Clone implements Cloneable
{
   public int day,month,year;

    Clone()
    {
        this(1,1,2001);
    }
    Clone(int day,int month,int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
            
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
            
        }
        if (obj instanceof Clone) 
        {
            Clone other = (Clone)obj;
            return day == other.day && month == other.month && year == other.year; // Compare field values

        }
        return false;
        
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(day,month,year);
    }

    
	@Override
	public String toString() 
	{
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

    @Override
    public Object clone() throws CloneNotSupportedException
    {

        return super.clone();
    }



    public static void main(String[] args) throws Exception
    {
        Clone c1 = new Clone(2,2,2002);
        Clone c2 = (Clone)c1.clone(); //cloning the c1 into c2 tis will get shallow copy as primitive datatypes

        System.out.println("c1 hashcode = "+c1.hashCode()); // hashcode of both will be same
        System.out.println("c2 hashcode ="+c2.hashCode());

        System.out.println(c1.equals(c2));

    }
}
