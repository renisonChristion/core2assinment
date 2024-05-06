package assignmentjava;
//Create a class named 'Print Number' to print various numbers of different data types 
//by creating different methods with the same name 'printn' having a parameter for 
//each data type

public class module21 {
	class PrintNumber{
		// creat same name diff parameters methods
		
		public int print(int n1) {
			return n1;
		}
		public float print(float n2) {
			return n2;
		}
		public double print(double n3) {
			return n3;
		}
		public long print(long n4) {
			return n4;
		}
	}
	public class Que21 {
		public static void main(String[] args) {
			// Create Object of Class
			PrintNumber p = new PrintNumber();
			System.out.println("int value :"+p.print(20));
			System.out.println("float value :"+p.print(12.203040));
			System.out.println("double value :"+p.print(36.2326958989));
			System.out.println("long value :"+p.print(656565656));
			
		}
}
