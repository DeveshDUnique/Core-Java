public class Boxing {
    public static void main(String[] args) {
        int num = 10;
        Integer obj = num;

        //Behind the scene 
        //Integer obj = Integer.valueOf(num); // Explicit conversion (done internally)


        System.out.println("Primitive Int : "+ num);
        System.out.println("Autoboxing Integer " + obj);

    }
    
}
