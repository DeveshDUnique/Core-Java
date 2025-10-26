package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Person {
     private String firstName;

    private String lastName;

    private int age;


    // Constructor

    public Person(String firstName, String lastName, int age) {

        this.firstName = firstName;

        this.lastName = lastName;

        this.age = age;

    }


    // Getters

    public String getFirstName() {

        return firstName;

    }


    public int getAge() {

        return age;

    }

    public static void main(String[] args) {
         List<Person> people = Arrays.asList(

                new Person("John", "Doe", 25),

                new Person("Jane", "Smith", 30),

                new Person("Alice", "Johnson", 28)

        );

        //'first' name of 'oldest' person in a list of objects.
       Optional<Person> oldestPerson = people.stream()
                                       .max(Comparator.comparing(Person::getAge));
        System.out.println("Oldest age = "+oldestPerson.get().age);
        System.out.println("First Name = " + oldestPerson.get().firstName);

    }
    
}
