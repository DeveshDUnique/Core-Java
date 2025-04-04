import java.util.Scanner;

public class Album 
{
    private int id;
	private String title;
	private String artist;
	private double price;
	private int tracks;
	public Album() 
    {

	}
	public Album(int id, String title, String artist, double price, int tracks) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.tracks = tracks;
	}
	public int getId() 
    {
		return id;
	}
	public void setId(int id) 
    {
		this.id = id;
	}
	public String getTitle() 
    {
		return title;
	}
	public void setTitle(String title) 
    {
		this.title = title;
	}
	public String getArtist() 
    {
		return artist;
	}
	public void setArtist(String artist) 
    {
		this.artist = artist;
	}
	public double getPrice() 
    {
		return price;
	}
	public void setPrice(double price) 
    {
		this.price = price;
	}
	public int getTracks() 
    {
		return tracks;
	}
	public void setTracks(int tracks) 
    {
		this.tracks = tracks;
	}

    public void accept(Scanner sd) //accepting the album details from the user
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Album id");
         this.id=sc.nextInt();
         System.out.println("Enter the Album title");
         this.title=sc.next();
         System.out.println("Enter the Album artist");
         this.artist=sc.next();
         System.out.println("Enter the Album price");
         this.price=sc.nextDouble();
         System.out.println("Enter the total number of Album tracks");
         this.tracks=sc.nextInt();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null || getClass() != obj.getClass())
        {
            return false; 
        }
        if (this == obj)
        {
            return true;   
        }
        if (obj instanceof Album)
        {
            Album other = (Album)obj; // casting
            if (this.id == other.id)
            {
                return true;   
            } 
        }
        return false;
    }

    @Override
    public String toString()
    {
        return "Album [id=" + id + ", title=" + title + ", artist=" + artist + ", price=" + price + ", tracks=" + tracks
				+ "]"; 
    }
}
