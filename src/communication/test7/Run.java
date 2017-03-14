package communication.test7;

public class Run {

	
	/**
	 * wait()  notify()
	 * 随机notify其中一个wait
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Object lock = new Object();
			MyThread1 t1 = new MyThread1(lock);
			t1.start();
			MyThread2 t2 = new MyThread2(lock);
			t2.start();
			MyThread3 t3 = new MyThread3(lock);
			t3.start();
			Thread.sleep(1000);
			NotifyThread notify = new NotifyThread(lock);
			notify.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
