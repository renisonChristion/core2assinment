package assignmentjava;
//W.A.J.P to check whether a given string starts with the contents of another string. 
//Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
//with Red? False I3.
public class module18 {
	public static void main(String[] args) {
		// given String
		
		String s1 = "Red is favorite color.";
		
		// check s1 starts with Red
		
		System.out.println(s1);
		System.out.println(s1.startsWith("Red"));
		
		// given String
		
		String s2 = "Orange is also my favorite color.";
		System.out.println(s2);
		
		// check s2 starts with Orange
		
		System.out.println(s2.startsWith("Red"));
	}
}
