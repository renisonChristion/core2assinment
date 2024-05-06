package assignmentjava;
//W.A.J.P to create 2 threads and execute that threads by providing sleep time as 
//2000ms and check the execution.

//Creating a class which implements Runnable interface
public class Que47 {
	class Abc implements Runnable{

		// Override the Run method of Runnable interface
		
		@Override
		public void run() {
			
			try {
				for(int i=1; i<=5 ; i++) {
					System.out.println("T : "+i+" "+Thread.currentThread().getName());
					Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}	
	}
	public class Que47 {
		public static void main(String[] args) throws Exception {
			
			// Creating an object of Abc class which implements the Runnable interface.
			Abc obj = new Abc();
			
			// Creating First Thread
			Thread t1 = new Thread(obj);
			
			// Creating Second Thread
			Thread t2 = new Thread(obj);
			
			//Starting First Thread
			t1.start();
			
			// sleep time 2000 mili seconds
			Thread.sleep(2000);
			
			// starting Second Thread
			
			t2.start();
		}
	}
}
