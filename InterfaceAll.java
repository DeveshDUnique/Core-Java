interface Shape 
{
    /*public static final field*/ double PI = 3.14;
	/*public abstract*/ double calcArea();
	
	/*public default method if not implemented will return 0.0*/
     default double calcPeri() 
	{
		return 0.0;
	}

    //static methods in interface
    static double totalArea(Shape[] arr)
    {
        double total = 0.0;
        for (Shape shape : arr) 
        {
            double area = shape.calcArea();
            total = total + area;   
        }
        return total;
    }
}
    class Rectangle implements Shape 
    {
        private int length, breadth;
        public Rectangle() 
        {

        }
        public Rectangle(int length, int breadth) 
        {
            this.length = length;
            this.breadth = breadth;
        }
        public double calcArea() 
        {
            return length * breadth;
        }
    }
    
    class Circle implements Shape 
    {
        private double radius;
        public Circle() {
        }
        public Circle(double radius) 
        {
            this.radius = radius;
        }
        public double calcArea() 
        {
            return Shape.PI * radius * radius;
        }
    }
    
    class Square implements Shape {
        private double side;
        public Square() {
        }
        public Square(double side) {
            this.side = side;
        }
        public double calcArea() {
            return side * side;
        }
        public double calcPeri() {
            return 4 * side;
        }
    }
    
    
public class InterfaceAll {
        public static void main(String[] args) 
        {
            Square s = new Square(10);
            System.out.println("Square Area: " + s.calcArea()); // 100
            System.out.println("Square Peri: " + s.calcPeri()); // 40
        
            Circle c = new Circle(7);
            System.out.println("Circle Area: " + c.calcArea()); // ~154
            
            Rectangle1 r = new Rectangle1(10, 4);
            System.out.println("Rectangle Area: " + r.calcArea()); // 40
            System.out.println("Rectangle Peri: " + r.calcPeri()); // 0

            Shape arr[] = new Shape[3]; // for square,circle and rectangle
            arr[0] = new Square(8); //64
            arr[1] = new Circle(10); //314.159
            arr[2] = new Rectangle1(7, 6); //63
            double totalArea = Shape.totalArea(arr);
            System.out.println("The total area is = "+totalArea);


        }          
    } 

