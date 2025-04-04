public class Rectangle1 {
    public int length;
    public int breadth;

    public  Rectangle1()
    {
        this(10,5);

    }
    
    public Rectangle1(int length, int breadth) 
    {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public String toString()
    {
        return "Rectangle1 [length=" + length + ", breadth=" + breadth + "]";
    }

    public void calculateRectangleArea()
    {
        System.out.println("length of rectangle = " + this.length * this.breadth);
    }

       public static void modifyBox(Rectangle1 boxParameter) {
        System.out.println("Inside method (before modification): boxParameter = " + boxParameter); // 
        boxParameter.length = 5; boxParameter.breadth = 6;
        System.out.println("In method modifyBox Object Identity HashCode: " + System.identityHashCode(boxParameter));
        System.out.println("Inside method (after modification): boxParameter = " + boxParameter);  // 

    }
    
}
