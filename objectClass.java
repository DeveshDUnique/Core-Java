class laptop
{
    String model;
    int prices;

    public String toString()
    {
        return model + " " + prices;
    }


    public boolean equals(laptop that)
    {
        if(this.model.equals(that.model) && this.prices == that.prices)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}


public class objectClass 
{
    public static void main(String args[])
    {
        laptop lp = new laptop();
        lp.model = "asus";
        lp.prices = 84586;

        //System.out.println(lp.toString()); //everytime we try to print the object by-default it will call the toString method
        
        laptop lp1 = new laptop();
        lp1.model = "asus";
        lp1.prices = 84586;

        boolean result = lp.equals(lp1);

        System.out.println(result);

    }
}
