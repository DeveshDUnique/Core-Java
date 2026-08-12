class Human
{

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human() // default constructor
    {
        age= 11;
        name = "shiv";
        System.out.println(("In default constructor"));
    }

    // parameterised constructor
    public Human(int age,String name) //constructor overloading
    {
        System.out.println(age + " " + name);
    }

}

public class Constructors 
{
    public static void main(String args[])
    {
        Human hu = new Human(); // the number of times the object is created the default constructor will be called.
        System.out.println(hu.getAge() + " "+hu.getName());

        Human ha = new Human(13,"veran"); // parameterised constructor will be called
        System.out.println(ha.getAge() +" "+ha.getName()); // this calles the default java values
    }
}
    














