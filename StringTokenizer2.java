import java.util.*;
public class StringTokenizer2 
{

    public static void main(String[] args) 
    {
        String str = "www.google.com";
        String delim = ".";
        StringTokenizer stk = new StringTokenizer(str,delim); //tokenizing string through the dot(.)
        String token = null;

        while (stk.hasMoreTokens())
        {
            token = stk.nextToken();
            System.out.println(token);
            
        }
    }
    
}
