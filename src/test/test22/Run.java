package test.test22;


public class Run {

	/**
	 * volatile 非原子性
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread[] thread = new MyThread[100];
		for (int i = 0; i < 100; i++) {
			thread[i] = new MyThread();
		}
		for (int i = 0; i < 100; i++) {
			thread[i].start();
		}
	}
	
}
