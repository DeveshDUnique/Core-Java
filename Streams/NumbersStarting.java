package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStarting {

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(11,18,23,56,19,76,83);

        List<Integer> filteredNumbers = lst.stream()
                                        .filter(n->String.valueOf(n).startsWith("1"))
                                        .collect(Collectors.toList());

        System.out.println("Filtered numbers = " + filteredNumbers);

        
    }
    
}
