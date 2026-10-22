package StringsAndStringBuilders;

import java.util.ArrayList;

public class Operators {
    
    public static void main(String[] args) {

        //Note : its a string concatination, as either operation is a string, the other operand will be converted to string and then concatenated.

        System.out.println('a' + 'b');
        System.out.println('a' + 1);
        System.out.println((char)('a' + 1));  //b
        System.out.println('a' + 1.0);
        System.out.println('a' + "1");
        //System.out.println('a' + true);
        System.out.println('a' + 'b' + "1");
        System.out.println("Dev" + new ArrayList<>());
        System.out.println("Dev" + new Integer(22));


        for(int i = 0; i < 26; i++) {
            System.out.print((char)('a' + i) + " "); //each iteration produces a concatenated String containing the character and a space. Since strings are immutable, concatenation creates a new object string
        }


        
    }
}
