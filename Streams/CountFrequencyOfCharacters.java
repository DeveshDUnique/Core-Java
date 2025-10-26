package Streams;

import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfCharacters {
    public static void main(String[] args) 
    {
        String str = "BANANA";
        String ss = str.toLowerCase();

        Map<Character,Long> countMap = str.chars()
                                          .mapToObj(c->(char)c)
                                          .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println("Frequency count = " + countMap);
        
    }
    
}
