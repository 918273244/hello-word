package communication.test5;

public class Service {

	public void testMethod(Object lock){
		try {
		synchronized (lock) {
			System.out.println("begin wait threadName = "+Thread.currentThread().getName());
				lock.wait();
//			Thread.sleep(3000);
			System.out.println("end wait threadName = "+Thread.currentThread().getName());
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void synNotifyMethod(Object lock){
		try {
			synchronized (lock) {
				
			System.out.println("begin notify ThreadName = "+Thread.currentThread().getName());
			lock.notify();
			Thread.sleep(5000);
			System.out.println("end notify ThreadName = "+Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
