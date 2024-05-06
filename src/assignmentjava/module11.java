package assignmentjava;

//Write a Java program to display the system time
import java.time.LocalTime;

public class module11 {
	public static void main(String[] args) {
		 // Get the current system time
       LocalTime currentTime = LocalTime.now();

       // Display the system time
       System.out.println("Current System Time: " + currentTime);
	}
}

