package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {

    private int empno;
	private String name;
	private double salary;
	private int age;
	private String gender;

    public Employee()
    {

    }
    public Employee(int empno , String  name, double salary,int age,String gender)
    {
        this.empno = empno;
        this.name = name;
        this.salary = salary;
		this.age = age;
		this.gender = gender;
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
	public String getGender() {
        return gender;
    }
	public int getAge(){
		return age;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", age =" + age + ", gender =" + gender + "]";
	}

	public static void main(String[] args) {

		List<Employee> emp = Arrays.asList(
			new Employee(1, "DEV", 3000000, 29, "MALE"),
			new Employee(2, "Shiv", 2000000, 25, "MALE"),
			new Employee(3, "Lalu", 1000000, 22, "MALE"),
			new Employee(4, "Babdi", 1500000, 28, "FEMALE"),
			new Employee(4,"Sona",1800000,31,"FEMALE")
		);

		// 1. How many  male and female employees are there in organization 
		Map<String, Long> genderCount = emp.stream()
										.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		// .collect(Collectors.groupingBy(e -> e.getGender().toLowerCase(), Collectors.counting()));
		System.out.println("Gender count of man and women =" + genderCount);

		// 2. Average salary of employees group by gender
		Map<String, Double> sal = emp.stream()
								  .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println("Average salary through the gender = "+ sal);
		
		// 3. Max salary of the employee
		Optional<Employee> maxSalary = emp.stream()
						   .max(Comparator.comparingDouble(Employee::getSalary));
		
	    System.out.println("MaxEmployee salary = "+maxSalary);

		// optional to double conversion
		Double maxEmpSalary = maxSalary.map(Employee::getSalary).orElse(0.0);
		System.out.println("Max salary = "+ maxEmpSalary);

		// top 3 highest paid employees.
		List<Employee> ll =emp.stream()
		.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		.limit(3)
		.collect(Collectors.toList());

		//Top 3 highst salary
		System.out.println("Top 3 highest paid employees = " + ll);
		for(int i=0; i<3; i++){
			Employee ee = ll.get(i);
			System.out.println("Top 3 highest salary = "+ee.getSalary());
		}

		//Second Highest salary of the employee

		List<Employee> ee =emp.stream()
		.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		.skip(1)
		.collect(Collectors.toList());

		System.out.println(ee.getFirst());
	}
}
