import java.util.Scanner;

public class Employees extends Person{
    private int empid;
	private double salary;


    @Override
    public void acceptData() // overiding
    {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter empid - ");
		this.empid = sc.nextInt();

		//this.acceptData(); // same class method will be called
		super.acceptData();// superclass

		System.out.print("Enter Salary - ");
		this.salary = sc.nextDouble();
    }

    @Override
	public void displayData() // method overriding
	{
		
		System.out.println("Empid - " + this.empid);

		// this.displayData();
		super.displayData();

		System.out.println("Salary - " + this.salary);
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double sal){
		this.salary = sal;

	}
    
}
