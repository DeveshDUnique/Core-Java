import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class FileSerializationObject 
{
    public static void writeMovies() 
    {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie(1, "Forest Gump", 8.5));
		list.add(new Movie(2, "Star Wars", 9.3));
		list.add(new Movie(3, "Harry Potter", 7.5));
		list.add(new Movie(4, "Intersteller", 6.6));
		list.add(new Movie(5, "Mission Imposible", 9.2));

        try(FileOutputStream fout = new FileOutputStream("Movies.db"))
        {
            try(ObjectOutputStream ost = new ObjectOutputStream(fout))
            {
                ost.writeObject(list); 
            }
        }
        catch (Exception e) 
        {
			e.printStackTrace();
		}
		System.out.println("Movies saved.");

    }

    public static void readMovies()
    {
        List<Movie> list;
        try(FileInputStream fis = new FileInputStream("Movies.db"))
        {
            try(ObjectInputStream ois = new ObjectInputStream(fis))
            {
                list =(List<Movie>) ois.readObject();
                for (Movie movie : list) 
                {
                    System.out.println(movie);
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) 
    {
        writeMovies();
        readMovies();
    }
    
}
