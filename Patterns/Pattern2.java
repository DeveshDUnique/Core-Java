package Patterns;

/*

* * * * * 
* * * * 
* * * 
* * 
* 

*/

public class Pattern2 {
    public static void main(String[] args) {
        pattern2(5);
    }

    public static void pattern2 (int n) {
        for(int row = 1; row <=n; row ++) {
            for(int col = n; col >=row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
    

