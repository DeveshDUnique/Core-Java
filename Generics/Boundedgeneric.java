package Generics;

/* bounded generic types restrict the data type */
public class Boundedgeneric<T extends Number> {

    private T data;

    public void set(T val){
        this.data = val;
    }

    public T get(){
        return this.data;
    }

    public static void main(String[] args) {
        // Boundedgeberic can be used for all the data types inherited from the number
        Boundedgeneric<Number> bn = new Boundedgeneric<>();
        bn.set(67);
        System.out.println("Number type = "+bn.get());


        Boundedgeneric<Integer> bi = new Boundedgeneric<>();
        bi.set(3);
        System.out.println("Integer type = "+bi.get());

        Boundedgeneric<Float> bf = new Boundedgeneric<>();
        bf.set(5.7f);
        System.out.println("Float type = "+bf.get());

        Boundedgeneric<Double> bd = new Boundedgeneric<>();
        bd.set(9.9);
        System.out.println("Double type = "+bd.get());

        Boundedgeneric<Boolean> bb =new Boundedgeneric<>(); // boolean does not extend the number type






        
    }
    
}
