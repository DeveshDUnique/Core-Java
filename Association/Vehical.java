import java.util.Scanner;

public class Vehical 
{
    private String vehName;
	private String vehNumber;

	public Vehical() 
    {

	}

	public Vehical(String vehName, String vehNumber) 
    {
		this.vehName = vehName;
		this.vehNumber = vehNumber;
	}

	public String getVehName() 
    {
		return vehName;
	}

	public void setVehName(String vehName) 
    {
		this.vehName = vehName;
	}

	public String getVehNumber() 
    {
		return vehNumber;
	}

	public void setVehNumber(String vehNumber) 
    {
		this.vehNumber = vehNumber;
	}

    public void acceptVehical()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vehical details  ");
        System.out.print("Enter the vehicle name - ");
		this.vehName = sc.next();
		System.out.print("Enter the vehicle number - ");
		this.vehNumber = sc.next();
	}

    public void displayVehical()
    {
        System.out.println("Here are the vehical details");
        System.out.println("Vehical name = " +vehName);
        System.out.println("Vehical number = "+vehNumber);
    }

}
    



