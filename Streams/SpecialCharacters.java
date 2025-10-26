package Streams;

import java.util.stream.Collectors;

public class SpecialCharacters {

    public static void main(String[] args) {

        String characters = "Hello,world! 123@#";
        String result = characters.chars()
                        .filter(c-> !Character.isLetterOrDigit(c))
                        .mapToObj(c-> String.valueOf((char) c))
                        .collect(Collectors.joining());

        System.out.println("Special character occurance in the string = "+ result);

        
    }
    



    
}
