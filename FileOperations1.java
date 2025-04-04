import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOperations1 
{
    public static void main(String[] args) 
    {    
    //File I/O reading and writing to another file

    String srcpath = "C:/Users/Admin/Desktop/Java/source.txt ";
    String destpath = "C:/Users/Admin/Desktop/Java/destination.txt";
    int b;
    //sourcefile for reading
    try(FileInputStream fin = new FileInputStream(srcpath))
    {
        //destination file for writing
        try(FileOutputStream fout = new FileOutputStream(destpath))
        {
            while ((b = fin.read()) != -1) 
            {
                fout.write(b);
                
            }
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();

    }
    System.out.println("File copied.");

}   
}
