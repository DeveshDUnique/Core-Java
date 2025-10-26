package Streams;

import java.util.stream.Collectors;

public class CharacterOccurance {
    public static void main(String[] args) {
        String value = "banana";
        char ch = 'a';

        String result = value.chars() //Converts the string into an IntStream of ASCII values
                        .filter(c->c != ch) //Removes all characters matching 'a'
                        .mapToObj(c -> String.valueOf((char) c)) // Converts the remaining int values back to String characters
                        .collect(Collectors.joining());

        System.out.println("Filtered the character occurance string = "+ result);

    }
    
}
