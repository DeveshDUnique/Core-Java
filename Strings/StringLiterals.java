package Strings;

import java.io.PrintStream;

public class StringLiterals {

    public static void main(String[] args) {
        String s1 = new String("Sunbeam").intern(); // intern will convert the string objects to string literal pool
        String s2 = new String("Sunbeam").intern(); //

        System.out.println("s1=s2 " + (s1==s2));

        String s3 = "sunbeam";
        String s4 = new String("sunbeam");

        System.out.println("equal in reference s3 and s4 "+s3==s4);
        System.out.println("equal in the values the s3 and s4 = "+s3.equals(s4)); // compares the values

        String s5 = s3.toUpperCase();
        System.out.println("is s3 and s5 equal in reference = "+ s3==s5);
        System.out.println("is s3 and s5 equal in object values "+ (s3.equals(s5)));

        String var1 = "sunbeam";
        String var2 = "sunbeam";
        System.out.println(var1);
        System.out.println(var2);
        System.out.println("var1==var2 : " + (var1 == var2));
        PrintStream var10000 = System.out;
        System.out.println(var10000); //java.io.PrintStream@5f5a92bb
        boolean var10001 = var1.equals(var2);
        System.out.println(var10001); //true
        var10000.println("var1.equals(var2) = " + var10001);

        String s6 = "sun" + "beam";
        System.out.println(s3==s6);

        String s7 = "sun";
        String s8 = s7 + "beam";
        System.out.println("s7 and s8 equal in reference = " + (s7==s8)); // false
        System.out.println(s7.hashCode());System.out.println(s8.hashCode());
        System.out.println("s7 and s8 equal in object values  "+ s7.equals(s8));

        System.out.println("char at index 3 = "+ s1.charAt(3));
		
		System.out.println("index of char 'e' = "+ s1.indexOf('e'));
		
		System.out.println("index of char nb = "+ s1.indexOf("nb"));
		
		System.out.println("length of  s1 = "+ s1.length());
		
		System.out.println("s1 concat = "+ s1.concat("infotech"));
		
		System.out.println("substring from index 3 = "+ s1.substring(3));
		
		System.out.println("substring from index 3,5 = "+ s1.substring(3,5));
		
    }

}
