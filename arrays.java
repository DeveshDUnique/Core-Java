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


        int arr1 [][] = new int[3][4]; //multi-dimension array

         for(int i=0;i<arr1.length;i++)
         {
            for(int j=0;j<arr1[i].length;j++)  //for iterating through the columns
            {
                arr1[i] [j] =  (int) (Math.random() * 100); // putting random numbers in the array
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
    }
  
}















