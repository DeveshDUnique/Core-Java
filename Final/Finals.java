package Final;
 //final keyword can be used in following ways.
    // Final fields
    // Final variables
    // Final class
    // Final methods
    
public class Finals 
{

    final int fild = 20;  //once the final fields are initialized we cannot change the value.
    final private int fild2 ;
    final private int fild3 ;
    // Object initializer
	{
		// fild = 2001; //NOT OK we cannot change the value of final field 
        fild2 = 100; //when we declred field as final we can inititialize them in the follwing ways
       // 1. in field initializer
        //2. in object initializer
        //3. inside constructor
        System.out.println(fild2);


	}
	
	public Finals() 
    {
		// fild = 3001; NOT OK  we cannot change the value of final field 
        fild3 = 500;
        final int fild4 = 600;
        System.out.println(fild3);
        System.out.println(fild4);

	}
	
	final public void displayTest()  //we cannot override final method but we can overload it.
    {
		//field1 = 101; //NOT OK
		System.out.println(fild);
		//System.out.println(fild2);
       // System.out.println(fild3);
		// System.out.println(field3);

	}

    final public void displayTest(int num)
    {
        System.out.println("overloaded the final method with parameters passed as numbers = " +num);
    }

   

    public static void main(String[] args) 
    {
        Finals ff = new Finals();
        ff.displayTest();
        ff.displayTest(5);
    }
    
}
