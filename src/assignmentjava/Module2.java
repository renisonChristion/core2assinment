package assignmentjava;

import java.util.Scanner;

public class Module2 {
	public static void main(String[] args) {
		// to take user input
		Scanner sc = new Scanner(System.in);
		
		// Take user input a char
		System.out.println("Enter any character :");
		char ch = sc.next().charAt(0);
		
		// convert char into int value (ASCII value)
		int i = ch;
		
		System.out.println("Ascii value of "+ch+" is : "+i);
	}
}

