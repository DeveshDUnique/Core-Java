package Access;


public class A 
{

   public int marks = 6;
   private int roll_no = 88;
   protected int id = 12;

   public void show()
   {
    System.out.println("show_method");
   }


}


class launch
{
    public void abc()
    {
    A obj =  new A();
    System.out.println(obj.id);
    }

}








