public class wrapper 
{
    public static void main(String args[])
    {
        int num = 6;
        Integer num1 = new Integer(8); //boxing

        Integer num2 =num;  //autoboxing as it is automatically getting converted into object.

        System.out.println(num2);

        int num3 = num2.intValue();  //unboxing  as it will convert object back to its primituve type

        System.out.println(num3);


        ///converting the string to integer

        String str = "12";
        int val = Integer.parseInt(str); //Parses the string argument as a signed decimal integer.
        System.out.println(val *3);

    }    
}
