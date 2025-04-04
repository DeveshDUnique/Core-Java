package Generics;

import java.util.ArrayList;
import java.util.List;

public class TypeEreaserGenerics {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        System.out.println(stringList.getClass() == intList.getClass());


        /*Although stringList is List<String> and intList is List<Integer>, Java erases type information at runtime.

The two lists become the same raw type ArrayList, making stringList.getClass() == intList.getClass() return true. */
    }
    
}
