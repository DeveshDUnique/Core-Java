public class GenericsLowerBound<T> 
{
    private T obj;
	public void set(T val) 
	{
		this.obj = val;
	}
	public T get() {
		return this.obj;
	}	
    

	// public static void printAnyBox(GenericsLowerBound<?> b) 
	// {
	// 	System.out.println("Any Box: " + b.get());
	// }
	
	// public static void printSubNumberBox(GenericsLowerBound<? extends Number> b) 
	// {
	// 	System.out.println("Number (or Sub-Class) Box: " + b.get());
	// }
	
	public static void printSuperNumberBox(GenericsLowerBound<? super Number> b) // method level LowerBound Generics with super keyword
	{
		System.out.println("Number (or Super) Box: " + b.get());
	}

	public static void main(String[] args) 
	{
	    GenericsLowerBound<Number> b1 = new GenericsLowerBound<>(); // Only the Number and its parent class can be called with  super as its lowerbound
	    b1.set(1234); // setting a number only
	    // GenericsLowerBound<Boolean> b2 = new GenericsLowerBound<>();
	    // b2.set(true);
	    // GenericsLowerBound<Character> b3 = new GenericsLowerBound<>();
	    // b3.set('A');
	    // GenericsLowerBound<String> b4 = new GenericsLowerBound<>();
	    // b4.set("Sunbeam");
	    // GenericsLowerBound<Integer> b5 = new GenericsLowerBound<>();
	    // b5.set(1);
	    // GenericsLowerBound<Double> b6 = new GenericsLowerBound<>();
	    // b6.set(3.14);
	    // GenericsLowerBound<Date> b7 = new GenericsLowerBound<>();
	    // b7.set(new Date());
	    GenericsLowerBound<Object> b8 = new GenericsLowerBound<>(); // // Only the Number and its parent class can be called with  super as its lowerbound
	    b8.set(new Object());
	    
	    // printAnyBox(b1);
	    // printAnyBox(b2);
	    // printAnyBox(b3);
	    // printAnyBox(b4);
	    // printAnyBox(b5);
	    // printAnyBox(b6);
	    // printAnyBox(b7);
	    // printAnyBox(b8);
	    
	    // printSubNumberBox(b1);
	//    printSubNumberBox(b2); // error
	//    printSubNumberBox(b3); // error
	//    printSubNumberBox(b4); // error
	    // printSubNumberBox(b5);
	    // printSubNumberBox(b6);
	//    printSubNumberBox(b7); // error
	//    printSubNumberBox(b8); // error

	
	    printSuperNumberBox(b1);
	//    printSuperNumberBox(b2); // error
	//    printSuperNumberBox(b3); // error
	//    printSuperNumberBox(b4); // error
	//    printSuperNumberBox(b5); // error
	//    printSuperNumberBox(b6); // error
	//    printSuperNumberBox(b7); // error
	    printSuperNumberBox(b8);
	}
}

