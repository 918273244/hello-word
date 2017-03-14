package communication.test6;

public class Service {

	public void testMethod(Object lock){
		try {
		synchronized (lock) {
			System.out.println("begin wait ");
				lock.wait();
//			Thread.sleep(3000);
			System.out.println("end wait");
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
