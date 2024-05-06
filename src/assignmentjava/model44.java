package assignmentjava;

//W.A.J.P to create a class Student with attributes roll no, name, age and course. 
//Initialize values through parameterized constructor. If age of student is not in 
//between 15 and 21 then generate user defined exception 
//"AgeNotWithinRangeException". If name contains numbers or special symbols 
//raise exception "NameNotValidException". Define the two exception classes. 

public class model44 {
	class AgeNotWithinRangeException extends Exception {
	    public AgeNotWithinRangeException(String message) {
	        super(message);
	    }
	}

	// User-defined exception for invalid name
	class NameNotValidException extends Exception {
	    public NameNotValidException(String message) {
	        super(message);
	    }
	}

	// creating a class Student
	class Students{
		
		// attributes of class
		private int roll_no, age;
		private String name, course;
		
		
		// Initialize values through Parameterised Constructor.
		
		public Students(int roll_no, int age, String name, String course) throws AgeNotWithinRangeException, NameNotValidException {
			        // Validate age
			        if (age < 15 || age > 21) {
			            throw new AgeNotWithinRangeException("Age should be between 15 and 21");
			        }

			        // Validate name
			        if (!name.matches("[a-zA-Z]+")) {
			            throw new NameNotValidException("Name should only contain letters");
			        }

			        // Assign values
			        this.roll_no = roll_no;
			        this.name = name;
			        this.age = age;
			        this.course = course;    	
		}
		
		 // Getter methods
		 public int getRollNo() {
		        return roll_no;
		    }

		    public String getName() {
		        return name;
		    }

		    public int getAge() {
		        return age;
		    }

		    public String getCourse() {
		        return course;
		    }
	}
	public class Que44 {
		public static void main(String[] args) {
			
			 try {
		            // Creating a student object with valid values
		            Students st = new Students(1, 10, "Meet", "java");
			 }
			 catch (AgeNotWithinRangeException e) {
				 System.out.println("Error : "+ e.getMessage());
			 }
			 catch(NameNotValidException e) {
				 System.out.println("Error : "+e.getMessage());
			 }
		}
}
