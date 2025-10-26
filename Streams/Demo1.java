package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*Java streams represents pipeline of operations through which data is processed.
Stream operations are of two types
Intermediate operations: Yields another stream.
filter()
map(), flatMap()
limit(), skip()
sorted(), distinct()

Terminal operations: Yields some result.
reduce()
forEach()
collect(), toArray()
count(), max(), min()
Stream operations are higher order functions (take functional interfaces as arg).

Java stream characteristics
No storage: Stream is an abstraction. Stream doesn’t store the data elements. They are stored in source collection or produced at runtime.
Immutable: Any operation doesn’t change the stream itself. The operations produce new stream of results.
Lazy evaluation: Stream is evaluated only if they have terminal operation. If terminal operation is not given, stream is not processed. 
Not reusable: Streams processed once (terminal operation) cannot be processed again.*/
public class Demo1 extends Employee {

    public static void main(String[] args) {
        List<Employee> ls = new ArrayList<>();
        Employee tom = new Employee(1, "TOM", 10000, 35, "MALE");
        Employee jerry = new Employee(2, "JERRY", 15000, 40,"MALE");
        Employee spike = new Employee(3, "SPIKE", 20000, 38,"MALE");
        Employee wiesel = new Employee(4,"WIESEL",25000, 22, "MALE");

        ls.add(spike);ls.add(tom);ls.add(jerry);ls.add(wiesel);

        // for (Employee employee : ls) {
        //     System.out.println(employee);
            
        // }
        //ALL EMPLOYEES WITH W NAME FIELD
        List<Employee> wName = ls.stream()
                                .filter(emp -> emp.getName().toLowerCase().startsWith("w"))
                                .collect(Collectors.toList());
        System.out.println("Employee name starting with w " + wName);

        //Given a list of employees, filter out employees who earn more than 6000 and whose names start with the letter ‘S’.
         List<Employee> startsWiths = ls.stream()
                                    .filter(employee -> employee.getSalary() > 6000 && employee.getName().toLowerCase().startsWith("s"))
                                    .collect(Collectors.toList());
        System.out.println("Employees who earm more than 6000 and name starts with s" + startsWiths);

        //Give a 40% Salary Hike to Each Employee and Print.
        List<Employee> hiked = ls.stream()
                                .map(employee ->new Employee (employee.getEmpno(),employee.getName(),employee.getSalary() * 1.4,employee.getAge(), employee.getGender()))
                                .collect(Collectors.toList());
        System.out.println("Employees given 40% hike " + hiked);

        
        //Find the Employee with the Maximum Salary
        Optional<Employee> maxEmp = ls.stream()
                                    .max(Comparator.comparingDouble(Employee::getSalary));
        
        System.out.println("Employee with maximum salary" + maxEmp);
    }
    
}
