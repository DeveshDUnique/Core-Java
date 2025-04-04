public class arrays 
{
    public static void main(String a[])
    {
        int arr[] = new int[4]; // Single dimension-array created
        int arrr1[] = new int[5];

        for(int i =0; i<arr.length;i++)
        {
            arr[i] =  (int) (Math.random() * 100); // putting random numbers in the array
            arrr1[i] = (int) (Math.random() * 10);
        }
         
        // Printing the array contents
        for (int i = 0; i < arr.length; i++) 
         {
            System.out.println(arr[i]);
            System.out.println("The arrr1 contents = " + arrr1[i]);
         }


         //multi-dimension array
        int arr1 [][] = new int[3][4]; //2D-dimension array
        int [][] arrr2 = new int[2][4];

         for(int i=0;i<arr1.length;i++)
         {
            for(int j=0;j<arr1[i].length;j++)  //for iterating through the columns
            {
                arr1[i] [j] =  (int) (Math.random() * 10); // putting random numbers in the array
                //System.out.println(arr1[i][j]);
            }
         }
         for(int i=0;i<arr1.length;i++)
         {
            for(int j=0;j<arr1[i].length;j++)  //for iterating through the columns
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
         }
          System.out.println();


         for(int i =0; i< arrr2.length;i++)
         {
            for(int j =0; j< arrr2[i].length;j++)
            {
               arrr2[i][j] = (int) (Math.random() * 100);
            }
         }
        System.out.println("Printing the array arrr2 ");
         for(int i=0; i<arrr2.length;i++)
         {
            for(int j=0;j<arrr2[i].length;j++)
            {
                System.out.print(arrr2[i][j] + " "); // column wise printing 
            }
            System.out.println(); // next line for new row printing
         }

         //enhanced for loop for printing same as above numbers
         System.out.println();
         for(int n[]:arr1)
         {
            for(int m:n)
            {
                System.out.print( m + " ");
            }
            System.out.println("Enhanced for loop ");
         }
         System.out.println();

         // 3-D array
         int darr[][][] = new int[2][3][4];

         
         




         // Ragged array: is an array when the number of columns are unknown

         //different number of columns in array

         int ragg[][] = new int[3][]; //Ragged array

         ragg[0] = new int[3];
         ragg[1] = new int[2];
         ragg[2] = new int[4];
        
          for(int i=0;i<ragg.length;i++)
         {
            for(int j=0;j<ragg[i].length;j++)  //for iterating through the columns
            {
                ragg[i] [j] =  (int) (Math.random() * 10); // putting random numbers in the array
                //System.out.println(arr1[i][j]);
            }
         }

         System.out.println("Ragged array ");
         for(int i=0;i<ragg.length;i++)
         {
            for(int j=0; j<ragg[i].length;j++)
            {
                System.out.print(ragg[i][j] + " ");
            }
            System.out.println();
         }
         System.out.println("Ragged array with enhanced for loop ");
        for(int n[]:ragg)
         {
            for(int m:n)
            {
                System.out.print( m + " ");
            }
            System.out.println();
         }

    // Reference array
    Rectangle1 rec[] = new Rectangle1[5];
    rec[0] = new Rectangle1();
    rec[1] = new Rectangle1(20,10);
    rec[2] = new Rectangle1();
    rec[3] = new Rectangle1(5,7);
    rec[4] = new Rectangle1(2,6);

    for(int i=0; i<rec.length;i++)
    {
        rec[i].calculateRectangleArea();
    }

    Rectangle1 rec2[] = new Rectangle1[]
    {
        new Rectangle1(),
        new Rectangle1(8,9),
        new Rectangle1(16,9),
        new Rectangle1()
    };
    System.out.println();
    for (Rectangle1 rectangle1 : rec2) {
        rectangle1.calculateRectangleArea();
        
    }
    }
}















