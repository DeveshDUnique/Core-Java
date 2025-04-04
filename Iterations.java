import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Iterations {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        List<Album> abs = new ArrayList<>();
        Album ab;
        ListIterator<Album>itr;
        int choice;
        do{
            System.out.print("\n1. Add Album\n2. Display All (Forward + Reverse)\n3. Search\n Zero for logout \n Enter choice: \n ");
            choice =sc.nextInt();
            switch (choice) 
            {
                case 0:
                System.out.println("Bye.... logging out");
                break;

                case 1:
                System.out.println("Add Album details");
                ab = new Album(); // new album object
                ab.accept(sc); // accepting the user album details
                abs.add(ab); // adding to the list the new album entered by user 
                break;

                case 2:
                System.out.println("Displaying all the albums through iterator in ascending and descending order");
                System.out.println("Forward Display");
                itr = abs.listIterator(); //iterating through the list
                while (itr.hasNext())
                {
                    ab = itr.next();
                    System.out.println(ab);
                }
                System.out.println("Reverse display ");
                itr = abs.listIterator(abs.size()); // reverse
                while (itr.hasPrevious())
                {
                    ab=itr.previous();
                    System.out.println(ab);
                    
                }
                break;

                case 3:
                System.out.print("Enter id of album to find: ");
				int id = sc.nextInt();
                // to search in list of Albums, pass Album object "key".
				// as equals() is based on "id", the "key" should be initialized with the id.
                Album key = new Album();
                key.setId(id);
                int index = abs.indexOf(key);
                if (index == -1)
                {
                    System.out.println("Does not contain the album");                    
                }
                else
                {
                    System.out.println("Album found at index "+ index);
                    ab = abs.get(index);
                    System.out.println(ab);
                }
                break;
                default:
                System.out.println("Enter only the correct choices");
                    break;
            }

        }while(choice != 0);




        
    }
    
}
