import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Jdbc 
{
    public static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/ipl";
    public static final String DB_User = "root";
    public static final String DB_Password = "manager";

    static
    {
        try{
            Class.forName(DB_Driver);
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }

    static Date parseDate(String str)
    {
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date date = sdf.parse(str);
            return date;

        }catch(ParseException e)
        {
            e.printStackTrace();
            return null;
        }
        
    }

    static void addPlayer()
    {
        Scanner sc = new Scanner(System.in);

        try{
            Connection con = DriverManager.getConnection(DB_URL,DB_User,DB_Password);
            String sql = "Insert into players VALUES (default,?,?,?,?,?) ";
            try(PreparedStatement pstmt = con.prepareStatement(sql))
            {
                System.out.println("batting_avg");
                double batting_avg = sc.nextDouble();
                System.out.println("");
                System.out.print("Birth Date (dd-MM-yyyy): ");
				String bdate = sc.next();
				Date utilDate = parseDate(bdate);
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

                System.out.println("First_name");
                String first_name = sc.next();
                System.out.println("last_name");
                String last_name = sc.next();
                System.out.println("wickets_taken");
                int wickets_taken = sc.nextInt();
                System.out.println("team_id");
                int team_id = sc.nextInt();

                pstmt.setDouble(1,batting_avg);
                pstmt.setDate(2, sqlDate);
                pstmt.setString(3, first_name);
                pstmt.setString(4, last_name);
                pstmt.setInt(5, wickets_taken);
                pstmt.setInt(6, team_id);

                int cnt = pstmt.executeUpdate();
                System.out.println("Rows inserted: " + cnt);

            }
         }catch (Exception e) 
         {
			e.printStackTrace();
		}
    }

    public static void main(String[] args) 
    {
        addPlayer();

    }
 
}
