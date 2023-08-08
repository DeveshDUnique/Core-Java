// Java program to illustrate the
// application of Integer literals

public class literal{
	public static void main(String[] args)
	{
		// integer-form literal
		int a = 101;
		// octal-form literal
		int b = 0100;
		// Hexa-decimal form literal
		int c = 0xFace;
		// Binary literal
		int d = 0b1111;
        // character
        char x = 's';
        x++;
	
		System.out.println("This is integer literal =" + a);
		System.out.println("octal-form literal =" + b);
		System.out.println("Hexa-decimal form literal =" + c);
		System.out.println("Binary literal =" +d);
        System.out.println("The character can be added also =" + x);
	}
}
