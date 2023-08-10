public class arrays 
{
    public static void main(String a[])
    {
        int arr[] = new int[4]; // Single dimension-array created

        for(int i =0; i<arr.length;i++)
        {
            arr[i] =  (int) (Math.random() * 100); // putting random numbers in the array
        }
         
        // Printing the array contents
        for (int i = 0; i < arr.length; i++) 
         {
            System.out.println(arr[i]);
         }


         //multi-dimension array
        int arr1 [][] = new int[3][4]; //2D-dimension array

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


         //enhanced for loop for printing same as above numbers

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

         
         




         // jagged array

         //different number of columns in array

         int jagg[][] = new int[3][]; //jagged array

         jagg[0] = new int[3];
         jagg[1] = new int[2];
         jagg[2] = new int[4];
        
          for(int i=0;i<jagg.length;i++)
         {
            for(int j=0;j<jagg[i].length;j++)  //for iterating through the columns
            {
                jagg[i] [j] =  (int) (Math.random() * 10); // putting random numbers in the array
                //System.out.println(arr1[i][j]);
            }
         }

        for(int n[]:jagg)
         {
            for(int m:n)
            {
                System.out.print( m + " ");
            }
            System.out.println("jagged array ");
         }


    }
  
}















