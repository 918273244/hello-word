package test.test10;

public class Run {

	/**
	 * 多线程死锁
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		DealThread t1 = new DealThread();
		t1.setFlag("A");
		Thread thread1 = new Thread(t1);
		thread1.start();
		Thread.sleep(1000);
		t1.setFlag("B");
		Thread thread2 = new Thread(t1);
		thread2.start();
		
	}
	
}
