package assignmentjava;
//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
//two methods to print the area and perimeter of the rectangle respectively. Its 
//constructor having parameters for length and breadth is used to initialize the length 
//and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
//constructor having a parameter for its side (suppose s) calling the constructor of its 
//parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.

public class module26 {
	class Rectangle{
		
		//create data members
		double length, breadth;
		
		// create a constructor for initialize value
		public Rectangle(double length, double breadth) {
			this.length = length;
			this.breadth = breadth;
		}
		
		// create two method for print area and perimeters of Rectangle
		public double area() {
			return length * breadth;
			
		}
		
		public double perimeter() {
			return 2*(length + breadth);
		}
	}

	// create Squre class which extends Rectangle 
	class Squre extends Rectangle{

		public Squre(double side) {
			 // Calling the constructor of the parent class 
			super(side, side);
		}
		
	}
	public class Que26 {
		public static void main(String[] args) {
			
			 // Creating an object of Rectangle
	        Rectangle rectangle = new Rectangle(5, 8);
	        
	        // Printing area and perimeter of the rectangle
	        
	        System.out.println("Area of Rectangle : "+rectangle.area());
	        System.out.println("Perimeter of Rectangle : "+rectangle.perimeter());
	        
	        // Creating an object of Square
	        Squre square = new Squre(4);

	        // Printing area and perimeter of the square
	        System.out.println("Area of Squre : "+square.area());
	        System.out.println("Perimeter of Squre : "+square.perimeter());
		}
}
