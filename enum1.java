
enum Status
{
    Running,Failed,Pending,Success;
}




public class enum1 
{
    public static void main(String args[])
    {
        Status s= Status.Running;
        Status t = Status.Failed;
        System.out.println(s);
        System.out.println(t);

        // ordinal method returns position in its enum declaration 

        System.out.println(t.ordinal());

       

        Status [] d = Status.values();

         // for printing all the enum objects
        for(Status i: d)
        {
            System.out.println(i);
        }


    }
}






















