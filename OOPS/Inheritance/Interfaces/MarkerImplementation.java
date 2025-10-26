package OOPS.Inheritance.Interfaces;

public class MarkerImplementation {

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // checking if the obj is marked with marker
        if (obj instanceof MarkerInterface) {
            System.out.println("Object is marked with the marker interface");
            obj.display();
        }else{
            System.out.println("The object is not market interface");
        }
    }
    
}
