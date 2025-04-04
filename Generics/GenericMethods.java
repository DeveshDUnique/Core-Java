package Generics;
/* Generic methods are used to implement generic algorithms. */
public class GenericMethods {
    // non type-safe
    public static void printArray(Object[] arr) {
    for(Object ele : arr)
    System.out.print(ele + " ");
    System.out.println("Number of elements printed: " + arr.length);
    }
/*Generic methods are used to implement generic algorithms. */
    public static <T> void printGenericArray(T[] arr) { // type safe
		System.out.println("Generic array:");
		for (T ele : arr) {
			System.out.println(ele);
		}
    }
    public static <T> void swap(T a, T b) {
		T t = a;
		a = b;
		b = t;
		System.out.println("In swap(): a = " + a + ", b = " + b);
	}
    public static void main(String[] args) {
        Object[] arr1 = {11,22,30};
        printArray(arr1);

        Object[] arr2 = {1.1,2.2,3.3};
        printArray(arr2);

        Object[] arr3 = {"dev","shiv"};
        printArray(arr3);

        Integer[] arr4 = { 11, 22, 33 };
		printGenericArray(arr4);
		Double[] arr5 = { 1.1, 2.2, 3.3 };
		printGenericArray(arr5);
		String[] arr6 = { "One", "Two", "Three" };
		printGenericArray(arr6);
        Boolean[] arr7 = {true,false,false,true};
        printGenericArray(arr7);


        swap(10.6, 20.2);
        swap("hello", "world");
        swap(true, false);
  
    }
}
