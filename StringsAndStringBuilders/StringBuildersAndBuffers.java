package StringsAndStringBuilders;
/*• equals() and hashCode() method is not overridden inside StringBuffers and StringBuilders.
 * object of these classes can be created with the new operator only.
 * StringBuilder is not Threadsafe
 */
public class StringBuildersAndBuffers {

    public static void main(String[] args) {
        
        //StringBuilder are mutable and dont make new object for every change in the string value.
        //  StringBuilder is not thread safe.
        StringBuilder sb = new StringBuilder("world");
        StringBuilder sb1 = new StringBuilder("world");
        System.out.println("StringBuilder Comparision");
        System.out.println("Equals method comparision " + sb.equals(sb1));
        System.out.println("sb == sb1 "+(sb==sb1));
        System.out.println(sb.equals("world")); //"world" is a String, not the same object as sb.
        System.out.println("sb hashcode() "+sb.hashCode());
        System.out.println("sb1 hashcode() "+sb1.hashCode());
        System.out.println(sb.hashCode() == sb1.hashCode());
        System.out.println();

        sb.append('!');
        sb.insert(0, "hello");
        sb.setCharAt(5,' ');
        System.out.println(sb);
        System.out.println(sb.charAt(3));//index of char at 3
        System.out.println(sb.indexOf("!"));//index of char !
        System.out.println(sb.length());//length of the string
        System.out.println(sb.substring(3));//substring from index 3
        System.out.println(sb.substring(3,5));//substring from index 3 to 5
        System.out.println(sb.reverse());//reverse the string
        System.out.println(sb.delete(0, 5));//delete from index 0 to
        System.out.println(sb.deleteCharAt(0));//delete char at index 0
        
        

        
        

        





        StringBuilder str = new StringBuilder(); // no new extra space is created for every change in the string value, it is mutable.
        for(int i=0; i<26; i++) {
            str.append((char)('a'+ i ));
            str.append(" ");
        }
        System.out.println(str);




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
