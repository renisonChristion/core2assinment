package assignmentjava;

//W.A.J.P to start the same Thread twice by calling start () method twice. 

public class Que48 {
	//Creating a class TreadTwice1 which  extends Thread Class.
}
	class TreadTwice1 extends Thread{
		
		@Override
		public void run() {
			System.out.println("Thread class extended");
		}
	}
	public class Que48 {
		public static void main(String[] args) {
		
			// Creating an object of TreadTwice1 class
			TreadTwice1 t1 = new TreadTwice1();
			
			// Starting Thread twice
			t1.start();
			
			// it cannot possible that same  Thread not execute twice it throws Exception.
			 // t1.start();
		}
}
