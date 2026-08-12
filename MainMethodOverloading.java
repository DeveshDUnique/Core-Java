public class MainMethodOverloading 
{

    public static void main() {

        System.out.println("This is main without parameters!");
        
    }

    public static void main(String args) {
        System.out.println(args +" main with string arguments");
        
    }

    public static void main(String[] args) 
    {
        main();
        main("Overloading");

        
    }
    
}
