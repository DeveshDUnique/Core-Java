@FunctionalInterface    
interface A
{
    public void show(int i);
    
}




public class Lambda 
{
    public static void main(String args[])
    {
        A obj  = (i) ->System.out.println("in show" + ":" +i); 
        
    obj.show(3);
    }    
}


