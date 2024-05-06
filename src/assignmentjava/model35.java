package assignmentjava;
//Create a class named 'Shape' with a method to print "This is this is shape". Then 
//create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both 
//having a method to print "This is rectangular shape" and "This is circular shape" 
//respectively. Create a subclass 'Square' of 'Rectangle' having a method to print 
//"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the 
//object of 'Square' class. 

public class model35 {
	class Shape1{
		
		// create a method
		public void print() {
			System.out.println("This is Shape.");
		}
	}

	//create class Rectangle which inherit Shape class
	class Rectangle1 extends Shape1{
		
		// create a method
		public void m1() {
			System.out.println("This is rectangular shape");
		}
	}

	//create class  which inherit Shape class
	class Circle1  extends Shape1{
		
		// create a method
			public void m2() {
				System.out.println("This is circular shape");
			}
	}

	//create a sub class of Rectangle class
	class Squre1 extends Rectangle1{
		
		// create a method
		public void m3() {
			System.out.println("This is rectangular shape");
		}
	}
	public class Que35 {
		public static void main(String[] args) {
			
			// creating an object of  Squre class
			Squre1 s = new Squre1();
			
			// calling mathods of Rectengle and Shape class
			s.m1();
			s.print();
		}
}
