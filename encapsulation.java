class human
{
    private String name = "dev";
    private int age = 12;

    public int getage()
    {
        return age;
    }

    public void setage(int a) // setting the age
    {
        age = a;
    }

    public String getname()
    {
        return name;
    }


    public void setname(String n) // setting the name
    {
        name = n;
    }
}


public class encapsulation {

    public static void main(String args[])
    {
        human hu = new human();
        hu.setage(21);
        hu.setname("Shiv");

        System.out.println(hu.getname()+": "+hu.getage()); 



    }
    
}





