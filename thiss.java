
class human
{
    private String name = "dev";
    private int age = 12;
    
    
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name; // this always point to the current object here to "dev"
    }
   

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age; // this always points to current object and here to "12"
    }
   
}



public class thiss
{
    public static void main(String args[])
    {
        human hu = new human();
        hu.setAge(21);
        hu.setName("shiv");

        System.out.println(hu.getAge());
        System.out.println(hu.getName());

    }
    
}













