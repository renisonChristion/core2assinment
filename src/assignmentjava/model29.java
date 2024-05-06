package assignmentjava;
//Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
//having a method with the same name 'message' that prints "This is first subclass" 
//and "This is second subclass" respectively. Call the methods 'message' by creating 
//an object for each subclass. 
public class model29 {
	abstract class Parent{
		
		// create an abstract method message
		
		public abstract void message();
	}

	// create first child class extends parent class
	class A_one extends Parent{

		// override the message method of Parent class	
		@Override
		public void message() {
			
			System.out.println("This is first subclass");
		}
}
