public class Upcasting {
    /* when the reference variable of the super class refers to the object of child class is called as upcasting.
     * Upcasting gives us the flexibility to access the parent class members, but it is not
    possible to access all the child class members using this feature.
    • Instead of all the members, we can access some specified members of the child
    class.
    • For instance, we can only access the overridden methods in the child class.
     */

    public static void main(String[] args) {

        Person p = new Employees();  // upcasting
        p.acceptData();
        p.displayData();
       // p.getSalary(); //not overidden

       /*You cannot directly access the child class fields (like empid and salary) using a
        reference variable of the parent class after upcasting in Java.
        
        p.empid  // not allowed
        p.salary


        to access the child class specific fields or methods we need to do downcasting

        Employees emp = (Employees) p
        */
       
       
       System.out.println();

    

       
    

        
         
        
    }
    
}
