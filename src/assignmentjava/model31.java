package assignmentjava;
//We have to calculate the percentage of marks obtained in three subjects (each out of 
//100) by student A and in four subjects (each out of 100) by student B. Create an 
//abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
//other classes 'A' and 'B' each having a method with the same name which returns the 
//percentage of the students. The constructor of student A takes the marks in three 
//subjects as its parameters and the marks in four subjects as its parameters for student 
//B. Create an object for each of the two classes and print the percentage of marks for 
//both the students.
public class model31 {
	abstract class Marks{
		
		//Create an abstract method getPercentage
		abstract double getPercentage();
	}

	// create class A for Student A
	class A extends Marks{
		private double mark1,mark2,mark3;
		
		// create constructor which takes  marks
		public A(double mark1,double mark2,double mark3) {
			this.mark1 = mark1;
			this.mark2 = mark2;
			this.mark3 = mark3;	
		}

		// override the method of Parent(Marks) class
		@Override
		double getPercentage() {
			double total = mark1 +  mark2 + mark3;
			double pr =  (total / 300) * 100;
			return pr;
		}
	}

	//create class B for Student B
	class B extends Marks{
		private double mark1,mark2,mark3,mark4;
		
		// create constructor which takes  marks
		public B(double mark1,double mark2,double mark3,double mark4) {
			this.mark1 = mark1;
			this.mark2 = mark2;
			this.mark3 = mark3;
			this.mark4 = mark4;
		}

		// override the method of Parent(Marks) class
		@Override
		double getPercentage() {
			double total = mark1 +  mark2 + mark3 + mark4;
			double pr =  (total / 400) * 100;
			return pr;
		}
	}
	public class Que31 {
		public static void main(String[] args) {
			
			// create  an object of class A
			A a =  new A(60, 60, 70);
			System.out.println("Persentage of Student A :"+a.getPercentage());
			
			// create  an object of class A
			B b =  new B(60, 60, 70,80);
			System.out.println("Persentage of Student B :"+b.getPercentage());
		}
}
