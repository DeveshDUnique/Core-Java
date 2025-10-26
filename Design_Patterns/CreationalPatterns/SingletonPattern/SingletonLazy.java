package Design_Patterns.CreationalPatterns.SingletonPattern;
public class SingletonLazy   // it is a design pattern which provides single object of the class.
{
    private static SingletonLazy s1 = null; //static field same type of class so as to hold single object in current class.


    private SingletonLazy()  // making the constructors as private
    {

    }

    public static SingletonLazy gets1() // getter for static field which will return the reference that points to single object created
    {
        if (s1 == null) 
        {
            return s1 = new SingletonLazy(); // only one object will be returned as we are initializing the static field s1 with new object
        }
        else
        {
            return null;
        }
    }
    public static void main(String[] args) 
    {
        // s1 = new SingletonLazy();  // creating a new object
        // System.out.println(s1);

        SingletonLazy single = SingletonLazy.gets1();
        System.out.println(single);

        SingletonLazy sing = SingletonLazy.gets1(); // null as only once the object will be created.
        System.out.println(sing);

    }
}


