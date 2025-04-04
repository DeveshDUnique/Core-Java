import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class MethodReferences 
{
       public static void main(String[] args) 
    {
        //Method reference to a "static method" called on class (ClassName::method)
		// the method is called on the classname
		// and all lambda args are passed to that method as its args.

        Comparator<Double>lambda = Double::compare;
         double diff   = lambda.compare(3.8, 3.2);
         System.out.println("Difference = "+diff);


         //Method reference to a "non-static method" called on 1st lambda arg (ClassName::method)
			// the method is called on 1st lambda arg
			// and rest of lambda args are passed to that method as its args

        Comparator<String>lambda1 = String::compareTo;
        int diff1 = lambda1.compare("dev", "shiv");
        System.out.println("string non-static method "+diff1);

        //Method reference to a non-static method called on an (external) object (obj::method)
		// the method is called on given object
		// and all lambda args are passed to that method as its args

        Consumer<Integer>lambda2 = System.out::println;
        lambda2.accept(1234);

        //Method reference to constructor (ClassName::new)
		// the object of class is created and param-less constructor of the class is executed
		Supplier<Date>lambda3 = Date::new;
        Date date = lambda3.get();
        System.out.println(date);

  
    }
    
}
