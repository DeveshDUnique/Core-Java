public class mainMethod_overloading 
{

    public static void main() {

        System.out.println("This is main without parameters!");
        
    }

    public static void main(String args) {
        System.out.println("main with string arguments " + args);
        
    }

    public static void main(String[] args) 
    {
        main();
        main("OverloadMain");

        
    }
    
}
