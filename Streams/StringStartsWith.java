package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringStartsWith {

    public static void main(String[] args) 
    {
        List<String> lst = Arrays.asList("apple", "banana", "cherry", "date");

        String prefix = "ba";

       Boolean matchers =  lst.stream()
                           .anyMatch(s -> s.startsWith(prefix));
        

        System.out.println("Check if starts with predix ba = "+ matchers);

        // to collect the strings which are starting with the prefix
        Set<String> filteredStrings = lst.stream()
                                      .filter(a->a.startsWith(prefix))
                                      .collect(Collectors.toSet());
        
        System.out.println(filteredStrings);
    }
}


