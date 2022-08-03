package sec04.verify.exam03;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread=new MovieThread();
		thread.start();
		
		try {
			thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		thread.interrupt();
	}

}
