package Strings;

public class StringReverse {

    public static void main(String[] args) {
        String s1 = "sunbeam";
        StringBuilder s2 = new StringBuilder(s1);

        System.out.println(s2.reverse()); // using reverse function in the stringBuilder.
        
        for(int i = s1.length() -1 ;i >=0 ;i--){ // normal for loop string reverse.
            System.out.print(s1.charAt(i));
        }
        System.out.println();

        StringBuilder sb1 = new StringBuilder("sunbeam");
		StringBuilder sb2 = new StringBuilder("sunbeam");

        System.out.println("sb1 == sb2 :"+(sb1==sb2));
		System.out.println("sb1.equals(sb2) :"+sb1.equals(sb2));





    }

    



    
}
