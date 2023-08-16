//final class calc  // final class decleration

class calc
{
    final public void show()  // constant show() method that cannot be overidden by advcalc
    {
        System.out.println("in Calc Show");
    }

    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}


class advcalc extends calc
{
    public void show()
    {
        System.out.println("in advcalc Show");
    }
}


public class finall 
{
    public static void main(String args[])
    {
        
        // final int num =9;
        // num = 10; // cannot change the constant variable num

        calc obj = new calc();
        obj.show();
        obj.add(3, 1);

        advcalc ob = new advcalc();
        ob.show();


    }
}











