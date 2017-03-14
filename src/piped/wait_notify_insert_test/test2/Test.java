package piped.wait_notify_insert_test.test2;

public class Test {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		System.out.println("主线程完毕");
	}
	
}
