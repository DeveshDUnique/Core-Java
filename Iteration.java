import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Iteration 
{
    public static void main(String[] args) {
        Collection<String> al = new ArrayList<>();
        al.add("sonu");
        al.add("monu");
        al.add("pratik");
        al.add("mulik");
        al.add("musale");
    

    System.out.println("\nTraverse collection using Iterator: ");

    Iterator<String> it = al.iterator();
    while (it.hasNext()) 
    {
        String ele =it.next();
        System.out.println("elements through iteration "+ ele);
        
    }

    }
}
