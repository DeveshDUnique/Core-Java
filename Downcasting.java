public class Downcasting {

    public static void main(String[] args) {
        // if downcasting fails it will throw an exception -> ClassCastException
		// for such non possible downcasting first check for the sub class object that
		// is created or not.

        Person p = new Employees();  //upcasting

        //checking the instance
        if (p instanceof Employees) {
            //downcasting.
            Employees emp = (Employees) p;
            System.out.println("Salary of the emp "+ emp.getSalary());
        }
    }
}
