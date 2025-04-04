import java.util.*;
import java.io.File;
import java.util.Date;

public class FileOperations 
{
    /*
 * Input a path from the user.
 * If path doesn't exists, then give error and exit.
 * If path is of directory, then list its contents.
 * If path is of file, then display its information (name, length, permissions, ...)
 * If path is not of file/directory, then give error.
 * */

 public static void main(String[] args) {
    //Input a path from the user
    Scanner sc = new Scanner(System.in); // scanner
    System.out.println("Enter the file path");
    String path = sc.nextLine();
    File file = new File(path);

    // * If path doesn't exists, then give error and exit.
    if (!file.exists())
    {
        System.out.println("Given filepath does not exist");
    }
    else if (file.isFile())
    {
      System.out.println("All the file info");
      System.out.println(file.getName());
      System.out.println(file.length());
      Date modtime = new Date(file.lastModified());
      System.out.println("modified time = "+modtime);
      System.out.println("Is Readable: " + file.canRead());
	 System.out.println("Is Writeable: " + file.canWrite());
	 System.out.println("Is Executable: " + file.canExecute());

    }
    if (file.isDirectory())
    {
        System.out.println("Its a directory/folder and contains the following files \n");
        String filelist[] = file.list();
        for (String str : filelist) 
        {
            System.out.println(str);
        }
        
    }
    else
			System.out.println("Neither file nor directory.");


}
    
}
