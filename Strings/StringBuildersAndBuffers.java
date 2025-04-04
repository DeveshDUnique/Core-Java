package Strings;
/*• equals() and hashCode() method is not overridden inside StringBuffers and StringBuilders.
 * object of these classes can be created with the new operator only.
 * StringBuilder is not Threadsafe
 */
public class StringBuildersAndBuffers {

    public static void main(String[] args) {
        
        //StringBuilder
        StringBuilder sb = new StringBuilder("world");
        StringBuilder sb1 = new StringBuilder("world");
        System.out.println("StringBuilder Comparision");
        System.out.println("Equals method comparision " + sb.equals(sb1));
        System.out.println("sb hashcode() "+sb.hashCode());
        System.out.println("sb1 hashcode() "+sb1.hashCode());
        System.out.println(sb.hashCode() == sb1.hashCode());

        //StringBuffer
        StringBuffer sbb = new StringBuffer("hello");
        StringBuffer sbb1 = new StringBuffer("hello");
        System.out.println("StringBuffer Comparison");
        System.out.println("Equal method comparion "+ sbb.equals(sbb1));
        System.out.println("sbb hashcode() "+sbb.hashCode());
        System.out.println("sbb1 hashcode() "+sbb1.hashCode());    
        System.out.println(sbb.hashCode() == sbb1.hashCode());    
    }
}
