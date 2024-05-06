package assignmentjava;

//creating a class which extends Thread Class
class A1 extends Thread{
	
	// override the run method
		@Override
	public void run() {
		
		for(int i=1; i<=5; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}
}
public class Que46 {
	public static void main(String[] args) {
		
		// Creating object of A1 Class Which extends Thread class
		A1 a =  new A1();
		
		// starting the Thread
		a.start();
	}
}
