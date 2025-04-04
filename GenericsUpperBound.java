public class GenericsUpperBound<T extends Number> //upperbound // All inherited from Number will work
{// generics upperbound at class-level

    private T obj;

    public void set(T val)
    {
        this.obj = val;
    }

    public T get()
    {
        return this.obj;
    }

    public Double toDouble()
    {
        return obj.doubleValue();
    }

    public Integer toInteger()
    {
        return obj.intValue();
    }



    public static void main(String[] args) {
        // only inherited from he number will work.
        GenericsUpperBound<Number> b1 = new GenericsUpperBound<>(); // okay
        b1.set(619);
        System.out.println(b1.get());
        //    Box<Boolean> b2 = new Box<>(); // error
        //    Box<Character> b3 = new Box<>(); // error
        //    Box<String> b4 = new Box<>(); // error
        GenericsUpperBound<Integer> b5 = new GenericsUpperBound<>(); // okay
        b5.set(10);
        System.out.println(b5.get());
        GenericsUpperBound<Double> b6 = new GenericsUpperBound<>(); // okay
        //    Box<Date> b7 = new Box<>(); // error
        //    Box<Object> b8 = new Box<>(); // error
            
        GenericsUpperBound<Integer> x = new GenericsUpperBound<>();
            x.set(3);
        GenericsUpperBound<Double> y = new GenericsUpperBound<>();
            y.set(3.14);
            if(x.toDouble() > y.toDouble())
                System.out.println("x is greater: " + x.get());
            else
                System.out.println("y is greater: " + y.get());
            System.out.println("Number " +b1);
        }
}
    

