package Exceptions;

public class TryWithResourcesDemo implements AutoCloseable  {// Custom resource that implements AutoCloseable.
    
    public TryWithResourcesDemo(){
        System.out.println("MyResourced Opened");
    }

    public void doWork(){
        System.out.println("MyResource is Working");
    }
    
    @Override
    public void close() throws Exception {
        System.out.println("myresource closed Automatially");
    }

    public static void main(String[] args) {
        // Using try-with-resources with our custom resource.
        try(TryWithResourcesDemo tr = new TryWithResourcesDemo()){
            tr.doWork();

        }catch(Exception e){
            e.printStackTrace();

        }
        System.out.println("Exited the try-with-resources block.");
    }

}
