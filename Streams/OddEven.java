package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //odd, even sum from the following
        Map<Boolean,Integer> sums =  lst.stream()
                                     .collect(Collectors.partitioningBy(n -> n%2 == 0,Collectors.summingInt(Integer::intValue)));

        System.out.println("Sum of odd even through streams  = " + sums);
    }
    
}
