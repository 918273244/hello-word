package piped.wait_notify_insert_test.test3;

/**
 * join相当于 wait
 * @author Administrator
 *
 */

public class Test {

	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.start();
		thread.join();
		System.out.println("主线程完毕");
	}
	
}
