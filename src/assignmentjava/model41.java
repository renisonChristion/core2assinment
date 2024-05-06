package assignmentjava;
//W.A.J.P to create the validate method that takes integer value as a parameter. If the 
//age is less than 18, then throw an Arithmetic Exception otherwise print a message 
//welcome to vote. 
//O/P- Enter your age: 16 
//Exception in thread main java. Lang. Arithmetic Exception: not valid

import java.util.Scanner;

public class model41 {
	int age = 0;
	
	// handle exception in try - catch block 
	
	try {
		validate(age);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}

// create validate method
static void validate(int age) {
	Scanner sc = new Scanner(System.in);
	
	// take age as input from user.
	
	System.out.println("Enter your age :");
	age = sc.nextInt();
	
	// if user enter age < 18 it throw ArithmeticException .
	
	if(age  < 18) {
			throw new ArithmeticException("not valid");
	}
	else
	{
		System.out.println("Welcome to vote.");
	}
	
}
}
