package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueWordsCollector {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(

                "Java 8 introduced streams",

                "Streams are powerful",

                "Use streams to process data"
        );

        Map<String,Long> unique= sentences.stream()
        .map(sentence-> sentence.split("\\s+"))
        .flatMap(Arrays::stream)
        .map(String::toLowerCase)
        //.collect(Collectors.toSet());
        .collect(Collectors.groupingBy(c->c,Collectors.counting())); //count of the unique words
        System.out.println("Unique words in the set are = "+unique);

    }
}
