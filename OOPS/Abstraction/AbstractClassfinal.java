package OOPS.Abstraction;
public class AbstractClassfinal extends AbstractClass1 { // Abstract class can extend only one abstract/concrete class.

    public AbstractClassfinal(int num) {
            super(num);
        }
    
        @Override
    public void abstractMethod() {
        System.out.println("implementation of the abstract method ");
    }
     // Additional method (optional)
     public void demoMethod() {
        System.out.println("This is Demo02's own method.");
    }

    public static void main(String[] args) {
        System.out.println(AbstractClass1.staticField);
       // AbstractClass1 aw = new AbstractClass1(9); // not possible to create object of abstract class Object Creation:You cannot instantiate

        AbstractClass1 ac = new AbstractClassfinal(8); 
        ac.abstractMethod();
        ac.nonAbstractMethod();

        
    }
    
}
