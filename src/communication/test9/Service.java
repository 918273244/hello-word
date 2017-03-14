package communication.test9;

public class Service {

	public void testMethod(Object lock){
		try {
		synchronized (lock) {
			System.out.println("begin wait thread name = "+Thread.currentThread().getName());
				lock.wait();
			System.out.println("end wait thread name = "+Thread.currentThread().getName());
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("出现异常了，因为呈wait状态的线程被interrupt");
		}
	}
	
}
