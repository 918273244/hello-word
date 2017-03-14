package piped.wait_notify_insert_test.test5;

/**
 * join相当于 wait
 * @author Administrator
 *
 */

public class Test {

	public static void main(String[] args) throws InterruptedException {

		ThreadB threadB = new ThreadB();
		threadB.start();
		Thread.sleep(500);
		ThreadC c = new ThreadC(threadB);
		c.start();
	}
	
}
