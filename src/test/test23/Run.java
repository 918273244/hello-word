package test.test23;


public class Run {

	/**
	 * volatile 原子性
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		MyThread[] thread = new MyThread[5];
		for (int i = 0; i < 5; i++) {
			thread[i] = new MyThread(service);
		}
		for (int i = 0; i < 5; i++) {
			thread[i].start();
		}
		Thread.sleep(5000);
		
		System.out.println(service.aiRef.get());
	}
}
