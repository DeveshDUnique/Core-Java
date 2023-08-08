public class typecasting {
    public static void main(String[] args)
    {
        // byte b =12;
        // int a =b;   // implicite typecasting


        int v = 33;
        byte c = (byte) v;  // explicit typecating

        float f = 5.5f;
        int n = (int)f;  // it will remove numbers after decimal points.

        // type promotions

        byte j = 10;
        byte i = 20;

        int result = j * i;  // here the mutiplication of bytes is above the range so inplicitely it will be converted to integers.

        System.out.println(result);
    
    }
}












