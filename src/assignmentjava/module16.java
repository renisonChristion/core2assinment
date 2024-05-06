package assignmentjava;

//W.A.J.P to compare a given string to the specified character sequence. Comparing 
//topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false

public class module16 {
	public class Que16 {
		public static void main(String[] args) {
			// given Strings
			String str1 = "topsint.com";
			String str2 = "topsint.com";
			String str3 = "Topsint.com";
			
			// Comparing Strings using  equals() method.
			
			System.out.println(str1.equals(str2));
			System.out.println(str1.equals(str3));
		}
}
