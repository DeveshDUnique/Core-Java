  // Base class Vehicle1
class Vehicle1 
{
    Vehicle1() 
    {
        System.out.println("Vehicle1 constructor");
    }
}

// Subclass Car extends Vehicle1
class Car extends Vehicle1 
{
    Car() 
    {
        super();  // Calls Vehicle1's constructor
        System.out.println("Car constructor");
    }
}

// Subclass Hyundai extends Car
class Hyundai extends Car 
{
    Hyundai() 
    {
        super();  // Calls Car's constructor
        System.out.println("Hyundai constructor");
    }
}

// Subclass Mahendra extends Car
class Mahendra extends Car 
{
    Mahendra() 
    {
        super();  // Calls Car's constructor
        System.out.println("Mahendra constructor");
    }
}

// Base class Vehicle2
class Vehicle2 
{
    Vehicle2() 
    {
        System.out.println("Vehicle2 constructor");
    }
}

// Subclass Bike extends Vehicle2
class Bike extends Vehicle2 
{
    Bike() 
    {
        super();  // Calls Vehicle2's constructor
        System.out.println("Bike constructor");
    }
}

// Subclass Honda extends Bike
class Honda extends Bike {
    Honda() {
        super();  // Calls Bike's constructor
        System.out.println("Honda constructor");
    }
}

// Subclass RoyalEnfield extends Bike
class RoyalEnfield extends Bike {
    RoyalEnfield() {
        super();  // Calls Bike's constructor
        System.out.println("RoyalEnfield constructor");
    }
}

public class ConstructorChaining 
{
    
    public static void main(String[] args) {
        System.out.println("Creating Hyundai:");
        Hyundai hyundai = new Hyundai();  // Constructor chaining for Hyundai
        
        System.out.println("\nCreating Mahendra:");
        Mahendra mahendra = new Mahendra();  // Constructor chaining for Mahendra
        
        System.out.println("\nCreating Honda:");
        Honda honda = new Honda();  // Constructor chaining for Honda
        
        System.out.println("\nCreating RoyalEnfield:");
        RoyalEnfield royalEnfield = new RoyalEnfield();  // Constructor chaining for RoyalEnfield
    }
}


    

