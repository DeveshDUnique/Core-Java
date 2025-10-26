package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStrings {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("apple","banana","cherry","fig","grape","kiwi");

        Map<Integer, List<String>> strGroup= str.stream()
        .collect(Collectors.groupingBy(String::length));

        System.out.println("String grouping = "+ strGroup);

        for(Map.Entry<Integer,List<String>> entry : strGroup.entrySet())
        {
            System.out.println("Length: "+entry.getKey() + " "+ entry.getValue());
        }


        //List of strings to Map where the key is String and value is length
        Map<String,Integer> countMap = str.stream()
                                       .collect(Collectors.toMap(s -> s, String::length));

        System.out.println("New Map is as = "+ countMap);
    }
    
}
