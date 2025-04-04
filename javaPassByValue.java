public class javaPassByValue {

    public static void modifyPrimitive(int parameterValue) {  // for primitive types

        System.out.println("Inside method (before modification): parameterValue = " + parameterValue); // Output: 20
        parameterValue = 10;
        System.out.println("Inside method (after modification): parameterValue = " + parameterValue); // Output: 10
    }

/*Think of it like this:

Primitive types:  Imagine you have a piece of paper with the number "10" written on it (originalValue).
When you pass it to someone (modifyPrimitive), you give them a photocopy of the paper.
If they erase "10" and write "20" on their copy, your original paper is still unchanged.

Reference types: Imagine you have a piece of paper with an address written on it (rectangle1).
This address points to a house (Rectangle1 object). 
When you pass the paper with the address to someone (modifyBox), 
you give them a photocopy of the paper with the address. 
Now, both you and the other person have a paper with the same address. 
If the other person goes to the house at that address and paints it a different color (changes width),
 when you go to the house using your paper with the address, you will see the house with the new color
  because it's the same house. */



    public static void main (String[] args) {
        int originalValue = 20;
        System.out.println("Before method call: originalValue = " + originalValue); // Output: 20
        modifyPrimitive(20);
        System.out.println("After method call: originalValue = " + originalValue);  // still 20
        System.out.println();
        //Now for reference type
        Rectangle1 rectangle1 = new Rectangle1(3, 4);
        System.out.println("Before method call - Object Identity HashCode: " + System.identityHashCode(rectangle1));
        System.out.println("Before method call: length = " + rectangle1.length); // 
        System.out.println("Before method call: breadth = " + rectangle1.breadth); //
        
        Rectangle1.modifyBox(rectangle1);
        System.out.println("After method call - Object Identity HashCode: " + System.identityHashCode(rectangle1));
        System.out.println("After method call: length = " + rectangle1.length); // 
        System.out.println("After method call: breadth = " + rectangle1.breadth); //

    }
}
