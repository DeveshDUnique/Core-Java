@FunctionalInterface    
interface A
{
    //public void show(int i);
    int add(int i,int j);
    
}


public class Lambda 
{
    public static void main(String[] args)
    {
        //A obj  = (i) -> System.out.println("in show" + ":" +i); 
        
    //obj.show(3);
        A obj = (int i, int j) ->  i+j;
        int result = obj.add(5, 8);
        System.out.println(result);
        
    }    
}




















