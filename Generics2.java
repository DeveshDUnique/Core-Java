public class Generics2 
{
    public static <T> void swap(T a, T b)
    {
        T t = a;
        a = b;
        b = t;

        System.out.println("In swap() a = "+a+" b ="+b);
    }

    public static void main(String[] args) 
    {
        Integer i1 = 10, i2 = 20;
        System.out.println("before swaping the integer i1 = "+i1 + " i2 = "+i2);
        System.out.println("after swapping = " );
        swap(i1, i2);

        Double d1 = 90.5, d2 = 120.9;
        System.out.println("before swaping the integer d1 = "+d1 + " d2 = "+d2);
        System.out.println("after swapping = " );
        swap(d1, d2);

        System.out.println("Before swap(): i1 = " + i1 + ", d2 = " + d2);
		swap(i1, d2);

        Integer i = 1;
		String s = "One";
		System.out.println("Before swap(): i = " + i + ", s = " + s);
		Generics2.<Object>swap(i, s); // T=Object --> swap(Object, Object);
        swap(i, s);

        
    }
    
}
