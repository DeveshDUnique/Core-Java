public class Singleton   // it i a design pattern which provides single object of the class.
{
    private static Singleton s1 = null; //static field same type of class so as to hold single object in current class.


    private Singleton()  // making the constructors as private
    {

    }

    public static Singleton gets1() // getter for static field which will return the reference that points to single object created
    {
        if (s1 == null) 
        {
            return s1 = new Singleton(); // only one object will be returned as we are initializing the static field s1 with new object
        }
        else
        {
            return null;
        }
    }
    public static void main(String[] args) 
    {
        s1 = new Singleton();  // creating a new object
        System.out.println(s1);



        Singleton single = Singleton.gets1();
        System.out.println(single);

        Singleton sing = Singleton.gets1(); // null as only once the object will be created.
        System.out.println(sing);

    }
}


