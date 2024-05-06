package assignmentjava;
//Write a program which will ask the user to enter his/her 
//marks (out of 100). Define a method that will display grades according to the marks

import java.util.Scanner;

public class model34 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Get marks from the user
		
        System.out.print("Enter your marks (out of 100): ");
        int marks = sc.nextInt();
        
        // Display grade
        displayGrade(marks);

	}
		
		// Method to display grade based on marks
	
		static void displayGrade(int marks) {
			if (marks >= 91 && marks <= 100) {
	            System.out.println("Grade: A");
	        }
			else if (marks >= 81 && marks <= 90) {
	            System.out.println("Grade: B");
	        } 
			else if (marks >= 71 && marks <= 80) {
	            System.out.println("Grade: B");
	        } 
			else if (marks >= 61 && marks <= 70) {
	            System.out.println("Grade: C");
	        } 
			else if (marks >= 51 && marks <= 60) {
	            System.out.println("Grade: D");
	        } 
			else if (marks >= 41 && marks <= 50) {
	            System.out.println("Grade: DD");
	        } 
			else if(marks <= 40) {
	           System.out.println("Fail.");
	        }
			else {
	        	System.out.println("Invalid Marks Entered.");
	        }
		}
}
