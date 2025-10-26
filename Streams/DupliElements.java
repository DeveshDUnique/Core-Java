package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DupliElements {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,2,3,4,5,4,6,7,8,9,7,5,0);
        Set<Integer> seen = new HashSet<>();

        Set<Integer> ss = lst.stream()
                          .filter(n -> !seen.add(n))
                          .collect(Collectors.toSet());

        System.out.println("Duplicate elements = "+ ss);

    }
    
}
