package Generics;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {


    public static void main(String[] args) {
    // Java 5.0 -- Generic programming using Generics (Templates)
    List ls = new ArrayList<>();
    ls.add(2.2);
    ls.add(9);
    ls.add("lst");
    for(int i=0;i<ls.size();i++){
        Object element = ls.get(i);
        System.out.println( "list elements "+element);
        // Unsafe casting example: Uncommenting below line may cause ClassCastException at runtime
        // int num = (int) element; // Will throw ClassCastException when element is not an Integer
    }


    ArrayList <Integer> ar = new ArrayList<Integer>();
    ar.add(8);
    ar.add(9);
    ar.add(3);
    ar.add(2);

    for(Integer ele : ar){
        System.out.print(ele + " ");
        String st = (String) ele; //compile time error as it cannot convert from integer to string.
    }
    }

    
}
