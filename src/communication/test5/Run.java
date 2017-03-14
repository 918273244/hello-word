package communication.test5;

public class Run {

	
	/**
	 * wait()  notify()
	 * @param args
	 */
	public static void main(String[] args) {
//		try {
			Object lock = new Object();
			MyThread2 t2 = new MyThread2(lock);
			t2.start();
			MyThread1 t1 = new MyThread1(lock);
			t1.start();
//			Thread.sleep(50);
			
			
			MyThread3 t3 = new MyThread3(lock);
			t3.start();
		/*} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
	
}
