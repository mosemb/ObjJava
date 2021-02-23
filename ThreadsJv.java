package objectoriented;
import java.util.*;

public class ThreadsJv {
	
	public static void main(String []args) {
		Thread t1 = new Thread(new MyThread(), "Thread 1");
		Thread t2 = new Thread(new MyThread(), "Thread 2");
		Thread t3 = new Thread(new MyThread(), "Thread 3");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Active threads "+Thread.activeCount());
		
		System.out.println("Start thread "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(3000);
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End thread "+Thread.currentThread().getName());
		
		
	}
	
}