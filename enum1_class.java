
enum laptop
{
    Asus(500),Macbook(1000),Dell(600),Hp(650),Samsung(700),Thinkpad;

    private laptop()  // default constructor generated
    {
        price = 500;
    }

    private int price;

    private laptop(int price)  // parameterised constructor generated
    {
        this.price = price;
        //System.out.println("in laptop " + this.name()); // it will call all the objects everytime the constructor is created.
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

}



public class enum1_class {
    public static void main(String args[])
    {
        laptop s = laptop.Asus;
        System.out.println(s + ":" + s.getPrice());



        // for getting all the laptop prices

        for(laptop lap : laptop.values())
        {
            System.out.println(lap + ": " + lap.getPrice() );
        }






        // enum in java extends the enum class
        System.out.println(s.getClass().getSuperclass());  


        }
    }










