package assignmentjava;
//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and 
//$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' 
//are subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
//method by creating an object of each of the three classes.

public class model30 {
	abstract class Bank{
		
		// Create an abstract method 'getBalance'.
		abstract void getBalance();
	}

	// create first subclass BankA
	class BankA extends Bank{

		// override the method of Parent class	
		@Override
		void getBalance() {
			System.out.println("Balance of Bank A : $100");
		}
	}

	//create second subclass BankB
	class BankB extends Bank{

		// override the method of Parent class	
		@Override
		void getBalance() {
			System.out.println("Balance of Bank B : $150");
		}
	}

	//create third subclass BankA
	class BankC extends Bank{

		// override the method of Parent class	
		@Override
		void getBalance() {
			System.out.println("Balance of Bank C : $200");
		}
	}
	public class Que30 {
		public static void main(String[] args) {
			
			// Create  an Object of First subclass
			BankA a = new BankA();
			
			// calling first child's overriden method
			a.getBalance();
			
			// Create  an Object of second subclass
			BankB b = new BankB();
					
			// calling second child's overriden method
			b.getBalance();
					
			// Create  an Object of third subclass
			BankC c = new BankC();
					
			// calling third child's overriden method
			c.getBalance();
		}
}
