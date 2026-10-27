package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        doublePattern(5);
    }

    public static void doublePattern(int n) {
        for(int row=1; row < 2*n; row++) {// starting from the 0 will add a blank as it wont print any '*'
            int colsInRow = row > n ? 2 * n -row : row;
            for(int col=0; col < colsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
