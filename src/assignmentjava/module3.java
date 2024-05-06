package assignmentjava;

//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
import java.util.Scanner;

public class module3 {
	public static void main(String[] args) {

		// for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");

		int n = sc.nextInt();
		int nn = n * 10 + n; // 5 * 10 = 50 + 5 = 55
		int nnn = n * 100 + nn;
		int sum = n + nn + nnn;

		System.out.println("n+nn+nnn : " + sum);
	}
}
