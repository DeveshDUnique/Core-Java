import java.util.StringTokenizer;

public class StringTokenizer1 {

    public static void main(String[] args) {
        
        String str = "Hello world its string tokenization";
        StringTokenizer stk = new StringTokenizer(str); // tokenizing the string on space
        String token = null;
        while (stk.hasMoreTokens()) 
        {
            token = stk.nextToken();
            System.out.println(token);
        }

    }
    
}
