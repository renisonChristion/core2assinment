package assignmentjava;
import java.util.Scanner;
public class program1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	// take three numbers from user 
	
	System.out.println("Enter Three Numbers :");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c =  sc.nextInt();
	System.out.println("A : "+a+" B: "+b+" C: "+c);
	
	// check throug if-else if ladder
	
	if(a > b &&  a > c) {
		System.out.println("A is greatest");
	}
	
	else if(b > a && b > c) {
		System.out.println("B is greatest");
	}
	
	else if(c > a && c > b) {
		System.out.println("C is greatest");
	}
}
}
