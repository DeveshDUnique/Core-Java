package StringsAndStringBuilders;

public class Pallindrome {

    public static void main(String[] args) {

        String ss = "abcba";

        boolean result = isPallindromeForLoop(ss);
        System.out.println("Is Pallindrome : " + result);

    }

    public static boolean isPallindromeWhileLoop(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPallindromeForLoop(String str) {
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

}
