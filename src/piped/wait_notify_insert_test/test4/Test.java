package piped.wait_notify_insert_test.test4;

/**
 * join相当于 wait
 * @author Administrator
 *
 */

public class Test {

	public static void main(String[] args) throws InterruptedException {

		MyThread t = new MyThread();
		t.start();
//		t.join(2000);
//		Thread.sleep(2000);
		System.out.println("main end Time = "+System.currentTimeMillis());
	}
	
}
