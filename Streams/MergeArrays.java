package Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArrays {
    public static void main(String[] args) {
         // Input arrays

        Integer[] array1 = {5, 3, 9, 1};

        Integer[] array2 = {3, 7, 1, 8};

        //merge, sort and distinct in new array

        Integer [] result = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
        .distinct()
        .sorted()
        .toArray(Integer[]::new);

        for(int i=0; i<=result.length -1; i++){
            System.out.println("New array = elements  "+result[i]);
        }

        System.out.println(Arrays.toString(result));
    }
    
}
