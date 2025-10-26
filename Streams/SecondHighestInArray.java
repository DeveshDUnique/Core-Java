package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestInArray {
    public static void main(String[] args) {
        List<Integer> secondHighest = Arrays.asList(1,1,5,7,9,3,4,5,8,7);

        List<Integer> secondList =secondHighest.stream()
        .sorted(Comparator.reverseOrder())
        .distinct()
        .skip(1)
        .collect(Collectors.toList());

        System.out.println("SecondHighest = "+ secondList.get(0));
        
    }
    
}
