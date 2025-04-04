import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) 
    {
        List<Integer> lst = new ArrayList<>();
        Collections.addAll(lst, 1,3,5,7,9,11,13,23);
        
       
        Stream<Integer> strm = lst.stream(); 
        strm
            .filter(ele -> ele%3 !=0) //// Filter odd numbers
            .map(ele -> ele*ele)
            .forEach(ele ->System.out.println(ele)); // print elements


        String[] names = {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan",
            "Pooja", "Lalita"};

        Stream.of(names)
                    .filter(s -> s.endsWith("a")) ///filtering the names
                    .map(s -> s.toUpperCase()) /// mapping with first letter as uppercase
                    .sorted((x,y) -> y.compareTo(x)) // sorting in descending order
                    //.sorted() // to sort in ascending order we need this.
                    .skip(2) //skipping the first two methods
                    .limit(4) // limiting the results to 4
                    .forEach(s -> System.out.println(s));
                    
                    long cnt = Stream.of(names) // count of all the 
                    .count();
                    System.out.println(cnt); 

        //collect() -- collects all stream elements into an collection (list, set, or map)
        List<String> lst1 = Stream.of(names) 
                    .collect(Collectors.toList());
                    System.out.println(lst1);

        Set<String> lst2 = Stream.of(names) // no duplicates
                         .collect(Collectors.toSet());
                         System.out.println(lst2);
        
        // Map<String> mp = Stream.of(names)
        //                 .collect(Collectors.toMap());


        //Optional values
        //Few stream operations yield Optional<> value.
        //Optional value is a wrapper/box for object of T type or no value.
        //It is safer way to deal with null values.
       Optional<String> optValue = Optional.of("Hello world");

       //Retriving the value using get
       if (optValue.isPresent())
        {
            System.out.println("Value using get " + optValue.get());
        }
        // Retrieving the value using orElse(), providing a default value if empty
       String defaultValue = "Default value";
       String value = optValue.orElse(defaultValue);
       System.out.println("Value using orElse "+ value);

       //Consuming Optional value using ifPresent
       optValue.ifPresent(val -> System.out.println("Value using ifPresent()" +val));

        // Example of Optional without a value (empty Optional)
       Optional<String> emptyOpt = Optional.empty();

         if (emptyOpt.isPresent())
        {
            System.out.println(emptyOpt);
        }
        else
        {
            System.out.println("Empty Optional value");
        }
        emptyOpt.ifPresent(val -> System.out.println("Empty value " + val));

    }
    
}
