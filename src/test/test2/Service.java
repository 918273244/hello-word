package test.test2;

public class Service {

	public void testMethod1(MyObject obj) {
		try {
			synchronized (obj) {
				System.out.println("testMethod1 ____getLock time = "
						+ System.currentTimeMillis() + " threadName = "
						+ Thread.currentThread().getName());

				Thread.sleep(2000);
				System.out.println("testMethod1 releaseLock time = "
						+ System.currentTimeMillis() + " threadName = "
						+ Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
