package Generics;

import java.util.Date;

/*Generic types naming convention
1. T : Type
2. N : Number
3. E : Element
4. K : Key
5. V : Value
6. S,U,R : Additional type param 

Generic Programming Using Generics
Added in Java 5.0.
Similar to templates in C++.
We can implement
Generic classes
Generic methods
Generic interfaces

Advantages of Generics
Stronger type checking at compile time i.e. type-safe coding.
Explicit type casting is not required.*/

public class Demo2 <T> {

    private T data;
    public void set(T val){
        this.data = val;
    }

    public T get(){
        return this.data;
    }

    public static void main(String[] args) {
        Demo2<String> d1 = new Demo2<>();  // String type data
        d1.set("Hello");
        System.out.println(d1.get());

        Demo2<Date> d2 = new Demo2<>(); // Date type Data
        d2.set(new Date());
        System.out.println(d2.get());

        Demo2<Number> d3 = new Demo2<>(); // Numeric type data a wrapper class which contains Number,boolean,character etc
        d3.set(10.9);
        System.out.println(d3.get());

        Demo2<Boolean> d4 = new Demo2<>();
        d4.set(true);
        System.out.println(d4.get());

        Demo2<Double> b4 = new Demo2<Double>();
		b4.set(new Double(3.14));
		String s4 = b4.get(); // compiler error beacuse of the generic type checking.
		System.out.println(s4);

        
    }
    
}
