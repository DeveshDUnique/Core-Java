class ABC
{

   public int marks = 6;
   private int roll_no = 88;
   protected int id = 12;

   public void show()
   {
    System.out.println("show_method");
   }

   void setroll_no(int roll_no)
   {
    this.roll_no = roll_no;
   }

   int getroll_no()
   {
    return roll_no;
   }




}

public class Launch extends ABC
{
    public void abc()
    {
    ABC obj =  new ABC();
    //System.out.println("private " + obj.roll_no); // not visible need getter and setters

    System.out.println("protected " + obj.id);

    System.out.println("protected " + obj.marks);

    }



public static void main(String[] args)
{
    Launch ll = new Launch();
    ll.abc();

    ABC a1 = new ABC();
    
    a1.setroll_no(20);  // setting the private variable valuesf
    System.out.println("private " + a1.getroll_no());
    
    
}
}


