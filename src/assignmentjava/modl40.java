package assignmentjava;

//• W.A.J. P to demonstrate try catch block, take two numbers from the user by 
//Command line argument and perform the division operation and handle Arithmetic 
//O/PException in thread main java. Lang. Arithmetic Exception:/ by zero

import java.util.Scanner;

public class modl40 {
	public static void main(String[] args)  {
		// for user input
		Scanner sc = new Scanner(System.in);
		
		// take  2 numbers from user
		System.out.println("Enter two numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		// if user set 0 as denominator then arithmetic Exception occurs.
		
		try {
			int div = n1 / n2;
			System.out.println(div);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
}
