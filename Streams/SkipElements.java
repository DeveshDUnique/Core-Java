package Streams;

import java.util.Arrays;
import java.util.List;

public class SkipElements {
    public static void main(String[] args) {
    List<String> items = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
    
    items.stream()
    .skip(5)
    .forEach(System.out::println);
    }
    
}
