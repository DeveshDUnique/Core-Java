package Final;

class Calc
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


class AdvCalc extends Calc  // cannot overide the final parent class
{
    @Override
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

        Calc obj = new Calc();
        obj.show();
        obj.add(3, 1);

        AdvCalc ob = new AdvCalc();
        ob.show();


    }
}











