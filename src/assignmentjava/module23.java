package assignmentjava;
//Create a class to print the area of a square and a rectangle. The class has two methods 
//with the same name but different number of parameters. The method for printing 
//area of a rectangle has two parameters which are length and breadth respectively 
//while the other method for printing area of square has one parameter which is side 
//of square. 

public class module23 {
	class AreaOf{
		
		// area of rectengle area = length * breadth

		public double Area(double length, double breadth) {
			double area = length * breadth;
			return area;
		}
		
		// area of Squre area = side * side
		
		public double Area(double side) {
			double area = side * side;
			return area;
		}
	}
	public class Que23 {
		public static void main(String[] args) {
			// create an object of  class.
			AreaOf obj = new AreaOf();
			
			// calling mathods of class
			
			System.out.println("Area of Rectengle : "+ obj.Area(12.5, 20.50));
			
			System.out.println("Area of Squre : "+ obj.Area(30.00));
		}
}
