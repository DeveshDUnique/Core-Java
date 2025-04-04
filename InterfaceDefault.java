interface default1{
    public static int fld =10;  // fields declared in the interface are public static final

    default void foo(){
        System.out.println("this is default method in the Interface");

    }

    public void abstracts();

}

public class InterfaceDefault implements default1 {

    @Override
    public void foo() {
        default1.super.foo();
    }
    

    public static void main(String[] args) {
        InterfaceDefault id = new InterfaceDefault();
       // fld = 20; // it is final field
        System.out.println( "static field in the interface = " +fld);
        id.foo();
    }


    @Override
    public void abstracts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abstracts'");
    }
   
}
