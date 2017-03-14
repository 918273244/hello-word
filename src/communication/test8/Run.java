package communication.test8;

public class Run {

	
	/**
	 * wait()  notify()
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Object lock = new Object();
			MyThread1 t1 = new MyThread1(lock);
			t1.start();
			Thread.sleep(5000);
			t1.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
