package communication.test6;

public class Run {

	
	/**
	 * wait()  notify()
	 * @param args
	 */
	public static void main(String[] args) {
//		try {
			Object lock = new Object();
			MyThread1 t1 = new MyThread1(lock);
			t1.start();
//			Thread.sleep(50);
			MyThread2 t2 = new MyThread2(lock);
			t2.start();
		/*} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
	
}
