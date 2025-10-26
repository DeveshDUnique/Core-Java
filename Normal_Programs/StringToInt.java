package Normal_Programs;

public class StringToInt {
    public static void main(String[] args) {
        String s = "$123,840/y";

        String numericString = s.replaceAll("[^0-9]", "");
        //System.out.println(numericString);

        int result = Integer.parseInt(numericString); //unboxing

        System.out.println(result);
    }
    
}
