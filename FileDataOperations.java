import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.util.*;
import java.io.EOFException;


public class FileDataOperations 
{

    public static void writeMovie()
    {
        List<Movie> lst = new ArraysList<>(); // we will add all the movies to list
        lst.add(new Movie(1,"titanic",4.5));
        lst.add(new Movie(2, "Star Wars", 9.3));
		lst.add(new Movie(3, "Harry Potter", 7.5));
		lst.add(new Movie(4, "Intersteller", 6.6));
		lst.add(new Movie(5, "Mission Imposible", 9.2));

        // writing to the file Movies.bin the movies
        try(FileOutputStream fout = new FileOutputStream("Movies.bin")) //Movies.bin binary file will be created
        {
            try(DataOutputStream dout = new DataOutputStream(fout))
            {
                    for (Movie movie : lst) 
                    {
                        dout.writeInt(movie.getId());
                        dout.writeUTF(movie.getTitle());
                        dout.writeDouble(movie.getRating()); 
                    }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void readMovie() 
    {
        // reading the movies.bin file that we added above

        try(FileInputStream fin = new FileInputStream("Movies.bin"))
        {
            try(DataInputStream din = new DataInputStream(fin))
            {
                while (true)
                {// it should follow the same order
                    Movie m = new Movie();
                    m.setId(din.readInt());
                    m.setTitle(din.readUTF());
                    m.setRating(din.readDouble());
                    
                    System.out.println("ID: " + m.getId() + ", Title: " + m.getTitle() + ", Rating: " + m.getRating());

                    
                }
            }
        }
        catch (EOFException e) {
            // do nothing
        }
        catch (Exception e) {
            e.printStackTrace();
        }
       
    }

    public static void main(String[] args) 
    {
        writeMovie();
        readMovie();
    }

  
    
}
