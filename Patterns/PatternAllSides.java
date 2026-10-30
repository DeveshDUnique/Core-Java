package Patterns;

public class PatternAllSides {

    public static void main(String[] args) {
        
        patternAllSides(4);
    }

    public static void patternAllSides(int n) {

        n = 2 * n;

        for(int row = 0; row <= n; row++) {
            for(int col = 0; col <= n; col++) {
                 int elementAtIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                 System.out.print(elementAtIndex + " ");
            }
            System.out.println();
        }
    }
}
