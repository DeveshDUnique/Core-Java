
public class Gen {

    public static void printObjectArray(Object arr[]) // object method
    {
        System.out.println("Object Array");
        for (Object object : arr) 
        {
            System.out.println(object);
            
        }
    }    

    public static <T> void printGenericArray(T arr[]) ///generic method
    {
        System.out.println("Generic Array");
        for (T t : arr) 
        {
            System.out.println(t);
            
        }
    }

    public static void main(String[] args) 
    {
        Object arr [] = {11,22,33}; //everything we are passing in object array and not its data-types
        printObjectArray(arr);  

        Object arr2[] = {2.2,3.1,7.9};
        printObjectArray(arr2);
        
        Object[] arr3 = { "One", "Two", "Three" };
		printObjectArray(arr3);

        Integer[] in = {89,99,45}; // here we are passing the values as per the data types in array
        printGenericArray(in);

        Double[] dd = {2.4,6.8,9.2};
        printGenericArray(dd);

        String[] st = {"hi","hello","hey"};
        printGenericArray(st);
    }
}
