

enum Status
{
    Running,Failed,Pending,Success;
}




public class enum1_if_switch
{
    public static void main(String args[])
    {
        Status s = Status.Pending;

        if(s == Status.Running)
        {
            System.out.println("All good");
        }
        else if(s == Status.Failed)
        {
            System.out.println("Not good");
        }
        else if(s == Status.Pending)
        {
            System.out.println("Please wait");
        }
        else
        System.out.println("Done");


        switch(s)
        {
            case Running:
            System.out.println("All good");
            break;

            case Failed:
            System.out.println("Not good");
            break;

            case Pending:
            System.out.println("Please wait");
            break;

            case Success:
            System.out.println("Done");

            default:
            System.out.println("Undefined");


        }
    }    
}
