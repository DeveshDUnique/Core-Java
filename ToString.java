public class ToString 
{
    /*
toString( ) method
• It is a non final method of java.lang.Object class.
• Syntax:
• public String toString( );
• If we want to return state of Java instance in String form then we should use toString() method.
• If we do not define toString() method inside class then super class's
• toString() method gets call.
• If we do not define toString() method inside any class then object class's
• toString() method gets call.
• It return String in the form: F.Q.ClassName@HashCode
• Example : test.Employee@6d06d69c
• If we want state of instance then we should override toString() method inside class.
• The result in toString method should be a concise but informative that is easy for a person to read.
• It is recommended that all subclasses override this method. */
    int day,month,year;

    public ToString()
    {
        this(1,1,2001); 
    }

    public ToString(int day,int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    @Override
    public String toString()  // toString method
    {
        return this.day+"/"+this.month+"/"+this.year;
    }

    public static void main(String[] args) 
    {
        ToString ts = new ToString(10,8,2025);
        System.out.println("Date : " + ts); 
    }
    
}
