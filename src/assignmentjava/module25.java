package assignmentjava;
//Create a class named 'Member' having the following members:It also has a method named 'printSalary' which prints the salary of the members
public class module25 {
	class Member{
		
		// class have following data members
		
		int Data_members,age;
		String Name,address;
		Long Phone_num;
		Double Salary;
		
		// create a printSalary method which prints salary
		
		public double printSalary(double Salary) {
			this.Salary = Salary;
			return Salary;
		}
	}
	public class Que25 {
		public static void main(String[] args) {
			// create an object of Member class
			
			Member obj = new Member();
			
			// Print salary through calling Member class's Method
			
			System.out.println("Salary is :"+obj.printSalary(55000.750));
		}
}
