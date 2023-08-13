class mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand +" : "+price+" : "+mobile.name);
    }

    public static void show1(mobile obj) // static methods with object parameters
    {
        System.out.println(obj.brand +" : "+obj.price+" : "+mobile.name); 

    }

    public mobile()  // connstructor of class mobile.
    {
        brand ="";
        price = 200;
        System.out.println("This is in constructor"); //the number of times object is created the constructor will be  called

    }

    static   // static block
    {
        name ="Phone";
        System.out.println("This is in static block"); // the class is only oaded once so the static block will always be called once and before the object


    }
}


public class statics
{
    /**
     * @param args
     */
    public static void main(String args[]) throws ClassNotFoundException
    {
        Class.forName("mobile");  //calling the static block with the forname method in the class of class

        mobile mb = new mobile(); // object of mobile class
        // mb.brand = "Apple";
        // mb.price = 100000;

        // mobile.name = "Smartphone"; //static variables are called by class name

        // mb.show();



        //mobile mb1 = new mobile();// object of mobile class
        // mb1.brand = "samsung";
        // mb1.price = 30000;
        // mobile.name = "Smartphone";

        // mb1.name = "Mobiles"; // we can call static variables through objects also but call with class name to avid confusion

        // mb1.show();

        // mobile.show1(mb); // passing object for the static method parameters



        //System.out.println(mb1.brand +" : "+mb1.price+" : "+mobile.name);


        //mobile mb100 =new mobile();  //the number of times object is created the constructor will be  called

        
        
            
        
        


    }
    
}






