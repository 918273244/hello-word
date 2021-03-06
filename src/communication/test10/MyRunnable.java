package communication.test10;

/**
 * wait(5000)加入时间
 * @author Administrator
 *
 */

public class MyRunnable {

	static private Object lock = new Object();
	static private Runnable runnable = new Runnable() {

		@Override
		public void run() {
			try {
				synchronized (lock) {
					System.out.println("begin wait thread name = "
							+ Thread.currentThread().getName() + "; "
							+ System.currentTimeMillis());
					lock.wait(5000);
					System.out.println("end wait thread name = "
							+ Thread.currentThread().getName() + "; "
							+ System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};

	public static void main(String[] args) {
		Thread t = new Thread(runnable);
		t.start();
	}
	
}
