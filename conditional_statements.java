public class conditional_statements{
    public static void main(String[] args){


        int c =14;
        int v = 93;
        int g = 88;

        if (c>v && c<g) 
        {
            System.out.println("C is the greatest no ="+c);

        }
        else if (v >g)
        System.out.println("V is the greatest no ="+v);

        else
        System.out.println("g is the greatest no ="+g);


        // ternary operator

        int result = c%2==0 ? 1 : 0;
        System.out.println(result);



    }
}


























