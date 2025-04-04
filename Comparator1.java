import java.util.Arrays;
import java.util.Comparator;


public class Comparator1 
{
    public static void main(String[] args) 
    {   
        /*Comparator<>
Standard for comparing two (other) objects.
Has single abstract method int compare(T obj1, T obj2);
In java.util package.
Used by various methods like Arrays.sort(T[], comparator), ...
 */
    Employee2 arr[] = new Employee2[5];
    arr[0] = new Employee2(3,"nilesh", 50000.0);
    arr[1] = new Employee2(2,"ghule", 70000.0);
    arr[2] = new Employee2(1, "mate",90000.0);
    arr[3] = new Employee2(4, "ketan",40000.0);
    arr[4] = new Employee2(5,"somesh", 80000.0);

    System.out.println("Before Sort: ");
		for (Employee2 e : arr)
			System.out.println(e);
		
		// sort by empno -- Comparable
		Arrays.sort(arr);
	
		System.out.println("After Sort by Empno: ");
		for (Employee2 e : arr)
			System.out.println(e);
    // Define local class for sorting by name using Comparator
    class EmpNameComparator implements Comparator<Employee2> 
    {
        @Override
        public int compare(Employee2 e1, Employee2 e2) 
        {
            return e1.getName().compareTo(e2.getName());  //for string comparision in the compareto
        }
    }
    EmpNameComparator ec = new EmpNameComparator();
    Arrays.sort(arr,ec); // sorting w.r.t name
    System.out.println("After Sort by Employee name: ");
    for (Employee2 e1 : arr)
        System.out.println(e1);

    //comparing based on salary.
    class EmpSalComparator implements Comparator<Employee2>
    {
        @Override
        public int compare(Employee2 o1, Employee2 o2) 
        {
            int diff = Double.compare(o1.getSalary(), o2.getSalary());
            return diff;
            
        } 
    }
    EmpSalComparator es = new EmpSalComparator();
    Arrays.sort(arr, es); //comparing with the salary
    System.out.println("After sort employee by salary");
    for (Employee2 employee2 : arr) 
    {
        System.out.println(employee2);    
    }
    //
    /*// Multi-level sorting -- 1st level: department, 2nd level: designation, 3rd level: salary(int)
    class CustomComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
    int diff = e1.getName().compareTo(e2.getName());
    if(diff == 0)
    diff = e1.getEmpno() - e2.getEmpno());
    if(diff == 0)
    diff = e1.getSalary() - e2.getSalary();
    return diff;
    }
    }
    Employee[] arr = { ... };
Arrays.sort(arr, new CustomComparator());
// ... */

    }
}
    

