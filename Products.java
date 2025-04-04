import java.lang.Comparable;
import java.util.Objects;

public class Products implements Comparable<Products>
{
    private int id;
	private String name;
	private double price;
	public Products() {
	}
	public Products(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

    @Override
    public String toString()
    {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    //hashcode
    public int hashCode()
    {
        int hash = Objects.hash(this.id);
        return hash;
    }

    // Equals
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
        if(obj instanceof Products)
        {
            Products prod = (Products)obj;
            if (this.id == prod.id) 
            {
                return true;
                
            }
        }
        return false;
    }

    @Override
    public int compareTo(Products o) 
    {

        int diff = this.id - o.id; // comparing w.r.t id
        return diff;
        
    }
    
}
