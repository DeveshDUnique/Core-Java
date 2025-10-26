package WrapperClasses;
public class Unboxing {
    // wrapper classes to primtive type 
    public static void main(String[] args) {
        Integer obj = 20;
        int num = obj;
        
        //Behind the scene 
        //int num = obj.intValue(); // Explicit conversion (done internally)

        System.out.println("Wrapper Integer : "+obj);
        System.out.println("Auto-unboxing "+num);
    }
    
}
