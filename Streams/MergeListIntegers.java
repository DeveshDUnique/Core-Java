package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeListIntegers {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(1,3,4,6,7,8,9);
        List<Integer> lst2 = Arrays.asList(1,2,3,4,5,6,7);

        //merging the two list and then removing the duplicates.\

        List<Integer> merger = Stream.concat(lst1.stream(), lst2.stream())
                               .distinct()
                               .collect(Collectors.toList());
        Collections.sort(merger);
    
        System.out.println("Merged distint list = "+ merger);
        ;
    }
    
}
