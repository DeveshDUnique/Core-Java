public class PassByValue {
    /* java is always pass by value */

    public static void main(String[] args) {
        int originalValue = 10;
        System.out.println("Before method call (primitive): originalIntValue = " + originalValue + ", Address = " + System.identityHashCode(originalValue));
        modifyPrimitive(originalValue);
                System.out.println("After method call (primitive): originalIntValue = " + originalValue + ", Address = " + System.identityHashCode(originalValue));
                System.out.println();

        StringBuilder originalStringBuilder = new StringBuilder("Hello");
        System.out.println("Before method call (object): originalStringBuilder = " + originalStringBuilder + "   Address = " + originalStringBuilder.hashCode());
        modifyStringBuilder(originalStringBuilder);
        System.out.println("After method call (object): originalStringBuilder = " + originalStringBuilder +  "   Address = " + originalStringBuilder.hashCode());
        System.out.println();
        
            }
        
            private static void modifyPrimitive(int num) {
                System.out.println("Inside modifyPrimitive: Before modification, num = " +  "  Address = " + System.identityHashCode(num));
                num = num*num;
                System.out.println("Inside modifyPrimitive: After modification, num = " +  "  Address = " + System.identityHashCode(num));


            }

            public static void modifyStringBuilder(StringBuilder strBuilder) {
                System.out.println("Inside modifyStringBuilder: Before modification, strBuilder = " + strBuilder + "  Address = " + strBuilder.hashCode());
                strBuilder.append("world");
                System.out.println("Inside modifyStringBuilder: After modification, strBuilder = " + strBuilder + "  Address = " + strBuilder.hashCode());


            }

    
}
