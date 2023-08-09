class read{

    public int prints(int n1,int n2)
    {
        int i;
        i = n1 + n2;
        System.out.println(("This is another class method"));

        return i;
    }
}



public class class_objects 
{
    public static void main(String[] args)
    {
        int num1=4, num2= 5;
        int result = num1 + num2;

        System.out.println((result));

        read rs = new read();  // creating object of read class
        int output = rs.prints(2,3); // calling prints method with rs object.

        System.out.println((output));
    }
}
