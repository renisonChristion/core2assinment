package assignmentjava;
//W.A.J.P to create a custom exception if Customer withdraw amount which is greater 
//than account balance then program will show custom exception otherwise amount 
//will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 
//2500

import java.util.Scanner;

public class model43 {
	class Account{
		
		int balance = 2000;
		int amt;
		
		// creating a method withdrawl
		public void withdrawal() {
			
			this.balance = balance;
			this.amt = amt;
			// for user input amount 
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Account total Balance : "+ balance);
			
			System.out.println("Enter withdraw amount : ");
			amt = sc.nextInt();	
		}
		
		// create another method for custom exception
		public void perform() {

			if(amt > balance) {
				throw new ArithmeticException("Sorry, insufficient balance, you need more "+(amt-balance)+"Rs. to perform this transection.");
			}
			else {
				System.out.println("Withdrawl sucess");
			}
		}
	}
	public class Que43 {
		public static void main(String[] args) {
				
			// Creating an object of Account class
			Account ac = new  Account();
			ac.withdrawal();
			
			// handle exception in try - catch block.
			try {
				ac.perform();
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			
		}
}
