package Patterns;

/*

   1
  212
 32123
4321234
 32123
  212
   1
    

*/


public class Pattern1234 {
    public static void main(String[] args) {
        pattern1234(4);

    }


    public static void pattern1234(int n) {

        for(int row = 1; row <= 2 * n; row++) {

            int totalColumnsInRow = row > n ? 2 * n - row : row;
           

            for(int space = 0; space < n - totalColumnsInRow; space++) {
                System.out.print(" ");
            }

            for(int col = totalColumnsInRow; col >= 1; col--) {
                System.out.print(col);
            }

            for(int col = 2; col <= totalColumnsInRow; col++) {
                System.out.print(col);
            }

            System.out.println();
        }
    }
}
