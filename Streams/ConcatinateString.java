package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatinateString {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("apple","banana","pineapple","cherry","orange");
        System.out.println(str);

       String result = str.stream()
                       .collect(Collectors.joining(","));
        
        System.out.println("Concatinated and comma seperated string = " + result);

    }
    
}
