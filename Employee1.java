import java.lang.Comparable;
public class Employee1 implements Comparable<Employee1>
/*Comparable<>

Standard for comparing the current object to the other object.
Also referred as "Natural Ordering" for the class.
Has single abstract method int compareTo(T other);
In java.lang package.
Used by various methods like Arrays.sort(Object[]), ...

*/
{
    private String name;
    private int empno;
    private double salary;

    public Employee1()
    {

    }
    public Employee1(String name,int empno,double salary)
    {
        this.name = name;
        this.empno = empno;
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
	public void setName(String name) 
    {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

    @Override
    public int compareTo(Employee1 o) //To implement the compareTo method for comparing two Employee1 objects in 
    // //the Employee1 class, you need to decide on the basis of comparison. Typically, comparison can be done by 
    // //either name, empno, or salary.
    {
        //compare by empno
        if (this.empno != o.empno)
        {
            return this.empno - o.empno;
        }
        else if (this.empno == o.empno) // comparing the names
        {
            return this.name.compareTo(o.name);// for the string comparision
        }
        else{
            return (int)this.salary - (int)o.salary;
        }
    }
}
