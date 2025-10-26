package Normal_Programs;

import java.util.HashSet;
import java.util.Set;

public class SubStringWithoutRepeat {

        private static String lengthOfLongestSubstring(String ss) {
            
            //edge case conditions
            if(ss.length() == 0 || ss == null){
                return "";
            }

            Set<Character> set = new HashSet<>();

            
            

    }

    public static void main(String[] args) {
        String test1 = "abcabcbb";
        String test2 = "bbbb";
        String test3 = "pwwkew";
        String test4 = "";
        String test5 = "abcdefg";


        System.out.println("Length of longest substring withoutrepeating characters :");

        System.out.println("Input = "+ test1 + " output = "+ SubStringWithoutRepeat.lengthOfLongestSubstring(test1));
        System.out.println("Input = "+ test2 + " output = "+ SubStringWithoutRepeat.lengthOfLongestSubstring(test2));
        System.out.println("Input = "+ test3 + " output = "+ SubStringWithoutRepeat.lengthOfLongestSubstring(test3));
        System.out.println("Input = "+ test4 + " output = "+ SubStringWithoutRepeat.lengthOfLongestSubstring(test4));
        System.out.println("Input = "+ test5 + " output = "+ SubStringWithoutRepeat.lengthOfLongestSubstring(test5));
  
    }
    
}
