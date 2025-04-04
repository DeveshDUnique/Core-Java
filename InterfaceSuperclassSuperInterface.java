// Inclass of superclass vs superinterface clash the superclass wins

interface Displayable
{
    default void show()
    {
        System.out.println("Displayable.show() called");
    }
}

interface Printable
{
    default void show()
    {
        System.out.println("Printable.show() called");
    }
}




public class InterfaceSuperclassSuperInterface extends SuperClass implements Displayable,Printable
{

    // @Override
	// public void show() {
	// 	System.out.println("FourthClass.show() called.");
	// 	Displayable.super.show();
	// 	Printable.super.show();
	// }
    //Here in above code we have called the show methods A class can invoke methods of super interfaces using InterfaceName.super.
    // if we uncomment this and run the obj.show() then the above show() method will be called and in that the show methods of the interfaces
    public static void main(String[] args) 
    {
        InterfaceSuperclassSuperInterface obj = new InterfaceSuperclassSuperInterface();
        obj.show();// superclass show will be called

       
	}
        
}
    






