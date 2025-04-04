package Generics;

/*Unbounded generic type is indicated with a wild card "?" given while declaring a generic class reference */

public class Unboundedgeneric<T> {
    private T obj;

    public Unboundedgeneric(T obj){
        this.obj = obj;
    }
    public T get(){
        return this.obj;
    }
    public void set(T obj){
        this.obj =obj;
    }
    public static void printBox(Unboundedgeneric<?> ub){ // "?" the wild card will take any type as its unbounded
        Object obj = ub.get();
        System.out.println("Box contains = "+ obj);
    }

    public static void printCube(Unboundedgeneric<? extends Number> ub){ 
        /* in the upperbound all the inherited from the number will be taken */
        //'Generic param type can be the given class or its sub-class.'
        Object obj = ub.get();
        System.out.println("Cube contains UpperBound "+ obj);
    }

    public static void printCircle(Unboundedgeneric<? super Integer> lb){
        /*Generic param type can be the given class or its super-class. */
        Object obj = lb.get();
        System.out.println("Circle contains LowerBound "+ obj);
    }

    public static void main(String[] args) {
        Unboundedgeneric<Number> un = new Unboundedgeneric<Number>(20);
        printBox(un);

        Unboundedgeneric<String> us = new Unboundedgeneric<String>("String unbounded generic type");
        printBox(us);

        //upperbound
        Unboundedgeneric<Double> ud = new Unboundedgeneric<Double>(5.5);
        printCube(ud);

        //lowerbound
        Unboundedgeneric<Number> unn = new Unboundedgeneric<Number>(34);
        printCircle(unn);

        Unboundedgeneric<Object> uo = new Unboundedgeneric<Object>(0);
        printCircle(uo);  
    }
}
