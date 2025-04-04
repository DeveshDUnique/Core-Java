
import static TEST.Test.*;   // importing the static package

// statics are used in
// Static Fields
// Static methods
// Static Block
//  static imports


class Mobile
{
    String brand;
    int price;
    static String name;  //static fields

    public void show()
    {
        System.out.println(brand +" : " + price+" : "+Mobile.name);
    }

    public static void show1(Mobile obj) // static methods with object parameters
    {
        System.out.println(obj.brand +" : "+obj.price+" : "+Mobile.name); 

    }

    public Mobile()  // connstructor of class mobile.
    {
        brand = "";
        price = 200;
        System.out.println("This is in constructor"); //the number of times object is created the constructor will be  called

    }

    static   // static block
    {
       // brand ="vivo"       // static blocks will only contain static fields
        name ="Phone";
        System.out.println("This is in static block"); // the class is only loaded once so the static block will always be called once and before the object

    }
}
/*
Fields
Integer.SIZE (Integer is a class SIZE is a static field)
Integer.MAX_VALUE (Integer is a class MAX_VALUE is a static field)
System.out (System is a class out is a static field)
System.in (System is a class in is a static field)

Methods
main() (In java by default main method is static)
Integer.parseInt() (Integer is a class parseInt() is a static method)
Integer.valueOf() (Integer is a class valueOf() is a static method) 

*/


public class statics
{
    /**
     * @param args
     */
    public static void main(String args[]) throws ClassNotFoundException
    {
        //Class.forName("mobile");  //calling the static block with the forname method in the class of class

        Mobile mb = new Mobile(); // object of mobile class calling constructor of mobile

        Mobile.show1(mb); //calling static method

        method2(); // calling the static packages from another methods.
        method3();
        

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






