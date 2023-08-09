
// for,while are entry controlled loops
//do while is exi controlled loop.


public class loops {
    public static void main (String[] args)
    {
        // // nested while loops
        // int i =0;
        // while (i < 5 )
        // {   
        //     i++;
        //     System.out.println("Hi" +" " + i);

        //     int j =0;
        //     while (j <=3)
        //     {
        //         j++;
        //         System.out.println("Hello" + " " + j);
        //     }
        // }

        // System.out.println("bye" + i);



            // do while loops

            // int i =0;
            // do{
                
            //     System.out.println("Hi"+ i);
            //     i++;

            // }while(i<=4);


        // for loop

        for(int i=1; i<=3;i++)
        {
            System.out.println("Day" + " " + i); // 

            for(int j=1; j<=9;j++)
            {
                System.out.println(" " + (j+8) + "-" + (j+9));
            }
        }



    }    
}
