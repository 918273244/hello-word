package piped.wait_notify_insert_test.test4;

public class MyThread extends Thread{

	@Override
	public void run() {
		super.run();
		System.out.println("begin Time = "+System.currentTimeMillis());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
