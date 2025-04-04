package Arrays;

import java.util.Arrays;

public class Arrays1 {

    public static void main(String[] args) {
        int arr[] = {5,7,3,10,2,4,8,9};
        System.out.println(arr); // prints array address
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("the key 4 in the array is at index = " + Arrays.binarySearch(arr, 4));

        int arr1[] = {11,55,33,22,44};
		Arrays.sort(arr1);
		System.out.println("arr==arr1 :"+Arrays.equals(arr, arr1));

        double arr2[] = {111.22,55.34,33.56,22.78,44.92};
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));

    }
    
}
