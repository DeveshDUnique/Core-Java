
import java.util.Scanner;


public class Employee 
{

    private int empid;
	private String name;
	private double salary;
    private Date joiningDate; //Association 
    private Vehical automobile; // Association


    public Employee()  // if the employee does not give date input the default input will be saved
    {
        this.joiningDate = new Date();
    }

    public Employee(int empid, String name, double salary, int day, int month, int year) // composition -tightly coupled joining-date
    {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.joiningDate = new Date(day, month, year);

    }
    public Employee(int empid, String name, double salary, int day, int month, int year, Vehical vehical) // aggegration-loosely coupled vehical
    {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.joiningDate = new Date(day, month, year);
        this.automobile  = vehical; //aggegration for loose coupling

    }

    public void acceptEmployee()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee empid");
        empid = sc.nextInt();
        System.out.println("Enter the Employee name");
        name = sc.next();
        System.out.println("Enter the Employee salary");
        salary = sc.nextDouble();
        System.out.println("Enter the joining date");
        joiningDate.acceptDate(); //calling the method from Date class
        System.out.println("Do you have a vehical, Enter 1 for yes and 0 for no");
        int count = sc.nextInt();
        if (count == 1)
        {
            
            automobile = new Vehical(); // creating the object of the vehical class
            automobile.acceptVehical();
            
        }
        else
        {
            System.out.println(" ");
        }

    }

    public void displayEmployee( )
    {
        System.out.println("Displaying the Employee details ");
        System.out.println("Employee id = "+ empid);
        System.out.println("Employee name = "+name);
        System.out.println("Employee salary = "+salary);
        System.out.println("Employee joiningDate = " );
        joiningDate.displayDate();
        // check if the employee has vehical then only print the vehical details
        if (this.automobile != null) { 
           automobile.displayVehical();
        }
        else{
            System.out.println("Employee has no vehicle");
        }
        
    }

    public static void main(String[] args) 
    {
        Employee emp = new Employee();
        emp.acceptEmployee();
        emp.displayEmployee();

        
    }


    
}
