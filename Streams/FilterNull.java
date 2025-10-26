package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterNull {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

        lst.add("one");

        lst.add(null);

        lst.add("two");

        lst.add(null);

        lst.add("three");

        List<String> nonNull = lst.stream()
                               .filter(s->s != null)
                               .collect(Collectors.toList());
        System.out.println("Non-null new List = "+nonNull);


    }
    
}
