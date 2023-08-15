class calc
{
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }
}


class advcalc extends calc
{
    public int add(int num1, int num2)  // this add method will overide the add in calc class
    {
        return num1 + num2 +10;
    }
}



public class method_overiding 
{
    public static void main(String args[])
    {
        advcalc obj = new advcalc();
        int sum = obj.add(5, 9);

        System.out.println(sum);


    }
}
