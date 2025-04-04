import java.lang.Comparable;
public class Employee2 implements Comparable<Employee2>
{
    private int empno;
	private String name;
	private double salary;

    public Employee2()
    {

    }
    public Employee2(int empno , String  name, double salary)
    {
        this.empno = empno;
        this.name = name;
        this.salary = salary;
    }
    public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}
    @Override
    public int compareTo(Employee2 o) 
    {
        int diff = this.empno - o.empno;
        return diff;
    }    
}
