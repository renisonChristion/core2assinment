package assignmentjava;
//Create a class to print an integer and a character with two methods having the same 
//name but different sequence of the integer and the character parameters.
public class module22 {
	class Printer{
		
		
		// same name methods diff parameters in diff sequence
		public void A(int i, char ch) {
			System.out.println("Integer value : "+ i);
			System.out.println("Character value : "+ ch);
		}
		
		public void A(char ch, int i) {
			System.out.println("Character value : "+ ch);
			System.out.println("Integer value : "+ i);
		}
		
	}
	public class Que22 {
		public static void main(String[] args) {
			// create object of Printer class
			
			Printer ptr = new Printer();
			
			// calling method through object.
			ptr.A(45, 'A');
			ptr.A('B', 46);
		}
}
