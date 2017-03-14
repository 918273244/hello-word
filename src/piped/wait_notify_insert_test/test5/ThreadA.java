package piped.wait_notify_insert_test.test5;

public class ThreadA extends Thread{

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String newStr = new String();
			Math.random();
		}
	}
	
}
