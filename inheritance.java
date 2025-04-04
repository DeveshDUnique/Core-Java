
public class Inheritance 
{
    public static void main(String args[])
    {// • Except constructor, all the methods of super class inherit into sub class.
        Inheritance3 inh = new Inheritance3(); 
        System.out.println(inh.add(10, 3));
        System.out.println(inh.sub(9, 3));
        System.out.println(inh.mul(7, 5));
        System.out.println(inh.div(4, 2));
        System.out.println(inh.power(11, 2));
        System.out.println("static fields of super class inherit into sub class." + Inheritance3.fld);
        Inheritance3.superMethod(); // static method in super class
    }
}


