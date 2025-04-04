public class Equals {
    public static void main(String[] args) {
        Dates d1 = new Dates(01, 10, 2024);
        Dates d2 = new Dates(01, 10, 2024);

        if (d1 == d2) { // == checks the equality of references 
            System.out.println("Date is equal in reference");
        }else{
            System.out.println("Date is not equal in reference");
        }

        /*Your Dates class does NOT override the equals() method. 
        When a class doesn't explicitly override equals(), it inherits the equals() method from its parent class,
         which is Object by default.
        The Object class's equals() method simply compares object references.
         It behaves exactly the same as the == operator.
         It checks if two references point to the same object in memory.

        Therefore, d1.equals(d2) in your current code is also performing reference equality. 
        It's equivalent to d1 == d2. */

        if (d1.equals(d2)) { // equals() checks the equality of objects
            System.out.println("Date is equal in object values");           
        }else{
            System.out.println("Date is not equal in object values");
        }
    }
}


