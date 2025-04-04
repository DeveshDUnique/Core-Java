import java.util.Arrays;

public class Comparable 


{
    public static void main(String[] args) {
        
    Employee1 e1 = new Employee1("sham",101,2300000.00);

    Employee1 e2 = new Employee1("raju", 100, 2200000);

    // Comparing the two employees on employee number
    int comparison = e1.compareTo(e2);

    if (comparison > 0) 
    {
        System.out.println(e1.getName() + " has a higher empno than " + e2.getName());
    }else
     {
        System.out.println(e1.getName() + " has a lower empno than " + e2.getName());
     }

     Employee1 w1 = new Employee1("sonu", 11, 110000);
     Employee1 w2 = new Employee1("tonu", 11, 5478961);

     int compare = w1.compareTo(w2); /// comparing on name
     {
        if (compare > 0)
        {
            System.out.println(w1.getName() + " has a higher alphabet than "+w2.getName());
        }
        else
        {
            System.out.println(w1.getName() + " has a lower alphabet than "+w2.getName());
        }
     }

     Employee1 arr [] = new Employee1[5];
     arr[0] = new Employee1("Nilesh",3, 50000.0);
     arr[1] = new Employee1("ghule",2, 70000.0);
     arr[2] = new Employee1("mate",1, 90000.0);
     arr[3] = new Employee1("ketan",4, 40000.0);
     arr[4] = new Employee1("somesh",5, 80000.0);

     System.out.println("Before Sort: ");
		for (Employee1 e : arr)
			System.out.println(e.getName());

        Arrays.sort(arr); //Sorts the specified array of objects into ascending order, according to 
        //the natural ordering of its elements. All elements in the array must implement the Comparable interface.
        // Furthermore, all elements in the array must be mutually comparable (that is, e1.compareTo(e2) must not throw a ClassCastException for any elements e1 and e2 in the array).

        System.out.println("After sort");
        for (Employee1 employee1 : arr) {
            System.out.println(employee1.getName());
        }
}
}
    

