class human
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

    public human() // default constructor
    {
        age= 11;
        name = "shiv";
        System.out.println(("In constructor"));
    }

    // parameterised constructor
    public human(int age,String name) //constructor overloading
    {
        System.out.println(age + " " + name);
    }

}

public class constructor 
{
    public static void main(String args[])
    {
        human hu = new human(); // the number of times the object is created the constructor will be called.
        System.out.println(hu.getAge() + " "+hu.getName());

        human ha = new human(13,"veran"); //
    }
}















