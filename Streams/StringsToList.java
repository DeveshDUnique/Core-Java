package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsToList {

    public static void main(String[] args) {
    List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

    List<Integer> lst = strings.stream()
                        .map(String::length)
                        .collect(Collectors.toList());
    System.out.println("List of the Integers  = "+lst);

    }
}
