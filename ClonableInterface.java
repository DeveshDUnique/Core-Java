/* Cloneable is Marker Interface
 * Marker Interface is an interface with no any methods, An empty interface is called as marker interface,
 * It is used to provide extra information to jvm about the class that have implemented this interface
  */


public class ClonableInterface implements Cloneable {
    private String name;
    private int age;



    public ClonableInterface(String name, int age){
        this.name = name;
        this.age = age;

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public ClonableInterface clone() throws CloneNotSupportedException{  // 2. Override clone() method

        return (ClonableInterface)super.clone(); // call super.clone() and cast
    }

    @Override
    public String toString(){
        return "Person{ name = " + name + " age = "+ age + "}";
    }
    

    public static void main(String[] args) {
        ClonableInterface ci = new ClonableInterface("Dev ", 29);
        ClonableInterface cz = ci;
        System.out.println("without clone the cz reference equal = "+ (ci == cz)); // no new instance will be created it w
        System.out.println("Original person " + ci);
        /*• If we want to create new instance from existing instance then we should use clone method.
            • clone( ) is non final native method of java.lang.Object class.
            • Inside clone() method, if we want to create shallow copy instance then we should use super.clone( )
            method.
            • Cloneable is interface declared in java.lang package.
            • Without implementing Cloneable interface, if we try to create clone of the instance then clone() method
            throws CloneNotSupportedException. */

        try{
            ClonableInterface cc = ci.clone(); // 4. Use clone() to create a copy
            System.out.println("ClonedPerson " + cc);

            // Verify they are different objects, but with the same content.

            System.out.println("Are they same object{reference} " + (ci == cc)); /* is false because clone()
             created a new object (cc), which is different from the original object (ci).
              They are at different memory locations.
            */

            // Modify the cloned object's age
            // cc.setAge(20);
            // System.out.println("Cloned Person after age change: " + cc);

            System.out.println("Original Person (should be unchanged): " + ci);

            ci.setName("shiv");
            ci.setAge(21);
            System.out.println("Cloned Person after name,age change after the: " + cc.getName() +  cc.getAge());
            

        }catch(CloneNotSupportedException e)
        {
            System.out.println(e);
        }
    }
}
