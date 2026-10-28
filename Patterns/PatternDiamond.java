package Patterns;

/*

   * 
  * * 
 * * * 
* * * * 
 * * * 
  * * 
   * 

*/

public class PatternDiamond {

    public static void main(String[] args) {
        patternDiamond(4);
    }
    
    public static void patternDiamond(int n) {
        for(int row = 1; row <= 2*n; row++) {
            int totalColumnsInRow = row > n ? 2 * n - row : row;
            int totalSpaces = n - totalColumnsInRow;

            for(int s=0; s < totalSpaces; s++) {
                System.out.print(" ");
            }

            for(int col=0; col < totalColumnsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
