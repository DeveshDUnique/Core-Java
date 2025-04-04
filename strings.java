public class strings {
    public static void main(String args[])
    {
        String name = "dev";
        System.out.println((name));
        System.out.println((name.charAt(0)));
        System.out.println((name.concat("patil")));


        // strings are immutable by nature and cannot be changed once created

        String name1 = "dev";
        System.out.println(name==name1); // because to name1 object the address of name object is sent

        name1 = name1 + "patil"; // this will create new object with new address in heap memory

        System.out.println(name1); 


        // String Buffer is mutable where we can change it also its thread safe.


        StringBuffer sb = new StringBuffer("");
        System.out.println(sb.capacity()); // the Stringbuffer capacity is 16

        StringBuffer sb1 = new StringBuffer("shiv");
        System.out.println(sb1.hashCode());  //hashcode
        System.out.println(sb1.deleteCharAt(1)); // deleting character at specific index
        System.out.println(sb1.append("Dev"));



        //StringBuilder is not thread safe
        StringBuilder ss = new StringBuilder("");
        System.out.println(ss.capacity());  // string 

        StringBuilder ss1 = new StringBuilder("dev");

        System.out.println(ss.equals(ss1)); //false 

        // Using hashCode (from Object class)
        System.out.println(ss.hashCode() == ss1.hashCode());  // false

        //Stringbuilder and string buffer do not overide the hashcode and equals as they are mutable




    }
    
}





