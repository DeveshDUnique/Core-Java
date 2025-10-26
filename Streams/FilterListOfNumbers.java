package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListOfNumbers {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(10,11,45,2,9,67,43,3,1);

        Double avg = lst.stream()
                        .filter(n->n > 10)
                        .collect(Collectors.averagingInt(n->n));

        System.out.println("Greater than 10 and average = "+ avg);
    }
    
}
