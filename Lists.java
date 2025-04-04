import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.LinkedList;

public class Lists {

    private String name;
	private int age;

    public Lists()
    {

    }
    public Lists(String name,int age)
    {
        this.name = name;
        this.age = age;

    }

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    @Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

    public static void main(String[] args) {
       // List<Lists> ls = new ArrayList<>();
       // List<String> ls = new Vector<>();
        List<String> ls = new LinkedList<>();


        // ls.add(new Lists("Dev", 100));
        // ls.add(new Lists("Shiv", 1000));
        // ls.add(new Lists("vishnu", 200));

        ls.add("Nilesh");
		ls.add("Nitin");
		ls.add("Vishal");
		ls.add("Prashant");
        
        ls.add(2, "Rahul");  // add rahul at second index and index starts from 0
		System.out.println(ls.toString());

        ls.remove(3); // remove the vishal
		System.out.println(ls.toString());

        String ele = ls.get(1); // index at first index
		System.out.println("At Index 1: " + ele);

        ls.set(2, "Pratik"); //Replaces the element at the specified position in this list with the specified element (optional operation).
		System.out.println(ls.toString());
		// [Nilesh, Nitin, Pratik, Prashant]

    // for(Lists l:ls)
    // {
    //     System.out.println(l);

    // }

    Lists person = new Lists("vishal", 20);
    if (ls.contains(person))
    {
        System.out.println("In the list "+ person);
        
    }
    else
    {
        System.out.println("Not in list");
    }
}
    
}
