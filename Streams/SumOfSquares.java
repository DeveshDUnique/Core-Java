package Streams;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
                                
        int sumOfSquares = numbers.stream()
                           .mapToInt(x->x*x)
                           .sum();
        System.out.println("SumOfSquares = "+ sumOfSquares);


    }
    
}
