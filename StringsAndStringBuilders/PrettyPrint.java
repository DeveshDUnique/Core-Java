package StringsAndStringBuilders;

public class PrettyPrint {
    /*
Specifier	Data Type / Purpose	        Example Output
%s / %S	String (Lowercase / Uppercase)	"hello" / "HELLO"
%d	Decimal Integer (byte, short, int, long)	42
%f	Floating-point number (float, double)	3.141593
%c / %C	Character (Lowercase / Uppercase)	'a' / 'A'
%b / %B	Boolean (Lowercase / Uppercase)	true / TRUE
%x / %X	Hexadecimal integer	ff / FF
%o	Octal integer	52
%e / %E	Scientific notation	3.14e+00
%%	Literal percent sign (%)	%
%n	Platform-specific newline character	(Moves to next line)
   */

    public static void main(String[] args) {

        String name = "Sunbeam";
        int age = 5;
        double salary = 50000.50;
        char gender = 'M';
        boolean isActive = true;

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Salary: %.2f%n", salary);
        System.out.printf("Gender: %c%n", gender);
        System.out.printf("Active: %b%n", isActive);

        // Using uppercase specifiers
        System.out.printf("Name (Uppercase): %S%n", name);
        System.out.printf("Gender (Uppercase): %C%n", gender);

    }

}
