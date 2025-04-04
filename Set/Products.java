package Set;

import java.util.Objects;

public class Products implements Comparable<Products> {

    private int id;
    private String name;
    private double price;

    public Products(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getID(){
        return this.id;
    }

    public void setID(int id){
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
        return "Product [id ="+ id + " name ="+ name + " price ="+ price +"]";
    }

    @Override
    public int hashCode(){
        int hash = Objects.hash(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        else if (this == obj) {
            return true;
        }
        else if (obj instanceof Products) {
            Products other = (Products)obj;
            if (this.id == other.id) {
                return true;   
            }
        }
        return false;
    }

    @Override
    public int compareTo(Products o) {
        //coparing with the ids
        int diff = this.id - o.id;
        return diff;

    }
    
}
