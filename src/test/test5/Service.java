package test.test5;

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

	public static synchronized void printA() {
		try {
			System.out.println("在 "
					+ System.currentTimeMillis() + "进入pringA方法 threadName = "
					+ Thread.currentThread().getName());

			Thread.sleep(2000);
			System.out.println("在 "
					+ System.currentTimeMillis() + "离开pringA方法 threadName = "
					+ Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static synchronized void printB() {
		try {
			System.out.println("在 "
					+ System.currentTimeMillis() + "进入printB方法 threadName = "
					+ Thread.currentThread().getName());
			
			Thread.sleep(2000);
			System.out.println("在 "
					+ System.currentTimeMillis() + "离开printB方法 threadName = "
					+ Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  synchronized void printC() {
		try {
			System.out.println("在 "
					+ System.currentTimeMillis() + "进入printC方法 threadName = "
					+ Thread.currentThread().getName());
			
			Thread.sleep(2000);
			System.out.println("在 "
					+ System.currentTimeMillis() + "离开printC方法 threadName = "
					+ Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
