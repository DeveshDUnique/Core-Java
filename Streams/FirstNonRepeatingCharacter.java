package Streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "Eye";
        String ss = str.toLowerCase();


        Optional<Character> result   =  ss.chars() // Converts the string into an IntStream of character Unicode code points.
        .mapToObj(c ->(char) c) //Converts each Unicode int to char, turning IntStream into Stream<Character>.
        .collect(Collectors.groupingBy(c -> c,LinkedHashMap::new,Collectors.counting()))
        .entrySet().stream()
        .filter(entry -> entry.getValue() == 1)
        .map(Map.Entry::getKey)
        .findFirst();

        System.out.println("First non-repeating charater = "+result);
    }
    
}
