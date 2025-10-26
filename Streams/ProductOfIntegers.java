package Streams;

import java.util.Arrays;
import java.util.List;

public class ProductOfIntegers {
    public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int product = numbers.stream() // Stream<Integer>
        .mapToInt(Integer::intValue)   // take out the raw numbers // unboxing from wrapper to primitive
        .reduce(1,(a,b) -> a*b);

        System.out.println("Product of list numbers = "+ product);
    }
    
}
