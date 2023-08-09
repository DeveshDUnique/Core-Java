class read{

    int result = 0;
    public int add()
    {
        
        System.out.println(("This is just printing add method"));
        return 0;
        
    }

    public int add(int n1,int n2)   // method overloading
    {

        result = n1 + n2;
        System.out.println(result);
        return 0;
    }

     public int add(double n1,double n2, double n3)   //method overloading
    {

        double result1 = n1 + n2 + n3;
        System.out.println(result1);
        return 0;
    }
}




public class method_overloading
{
    public static void main(String[] args)
    {
        read rs = new read();
        rs.add();
        rs.add(3,6);
        rs.add(3.4, 6.7, 9.2);
    }


}