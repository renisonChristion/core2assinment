package assignmentjava;
//We have to calculate the area of a rectangle, a square and a circle. Create an abstract 
//class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
//parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
//parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
//side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
//all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
//area of rectangle, square and circle respectively. Create an object of class 'Area' and 
//call all the three methods

public class model33 {
	abstract class Shape{
		
		//create an abstract methods
		abstract void RectengleArea(double length, double breadth);
		abstract void SquareArea(double side);
		abstract void CircleArea(double radius);
	}

	// create a class area with all three overriden methods
	class Area extends Shape{

		@Override
		void RectengleArea(double length, double breadth) {
			double area = length * breadth;
			System.out.println("Area of Rectengle : "+area);
		}

		@Override
		void SquareArea(double side) {
			double area =  side * side;
			System.out.println("Area of Squre : "+area);
		}

		@Override
		void CircleArea(double radius) {
			double pi = 3.14;
			double area = pi * radius * radius;
			System.out.println("Area of Circle : "+area);
		}
		
	}
	public class Que33 {
		public static void main(String[] args) {
			
			// creating object of Area class
			Area a = new Area();
			
			// Calling methods of Area class
			a.RectengleArea(12.3, 6.5);
			
			a.SquareArea(34.15);
			
			a.CircleArea(6.5);
			
		}
}
