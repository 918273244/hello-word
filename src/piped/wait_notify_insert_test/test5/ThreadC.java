package piped.wait_notify_insert_test.test5;

public class ThreadC extends Thread{

	private ThreadB threadB;
	
	public ThreadC(ThreadB threadB) {
		this.threadB = threadB;
	}
	
	@Override
	public void run() {
		super.run();
		threadB.interrupt();
	}
	
}
