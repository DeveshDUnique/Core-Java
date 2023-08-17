abstract class car   // abstract class
{
    public abstract void drive();   //abstract method

    public abstract void fly();
    

    public void playMusic()
    {
        System.out.println(("Play music"));
    }
}


class bmw extends car  //concrete class
{
    public void drive()
    {
        System.out.println("Driving bmw");
    }

    public void fly()
    {
        System.out.println("flying....");
    }
}


public class abstract1 
{
public static void main(String args[])
{
    //car obj = new car(); //cannot create object of abstract class

    car obj = new bmw();

    obj.playMusic();
    obj.drive();
    obj.fly();
}    
}
