/*
According ANSI C standard, if we want to assign name to the integer constant then we should use
enum.
• Enum helps developer to improve readability of source code.
• An enum is a class that represents a group of constants
• Enum keyword is used to create an enum. The constants declared inside are separated by a comma
and should be in upper case.
• enum is used for values that are not going to change e.g. names of days, colors in a rainbow, number
of cards in a deck etc.
• enum is commonly used in switch statements. 
*/
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

        s = s.Macbook;

        switch(s)
        {
            case Asus:
            System.out.println("Asus Laptop");
            break;

            case Macbook:
            System.out.println("Not good Macbook");
            break;

            case Dell:
            System.out.println("Please wait Dell");
            break;

            case Hp:
            System.out.println("HP old laptops");
            break;

            case Samsung:
            System.out.println("Samsung Laptops");
            break;

            case Thinkpad:
            System.out.println("Worst Laptops");
            break;

            default:
            System.out.println("Undefined");


        }

        }
    }










