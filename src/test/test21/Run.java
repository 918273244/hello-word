package test.test21;


public class Run {

	/**
	 * volatile 非原子性
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		AddCountThread[] thread = new AddCountThread[5];
		for (int i = 0; i < 5; i++) {
			thread[i] = new AddCountThread();
		}
		for (int i = 0; i < 5; i++) {
			thread[i].start();
		}

		/*AddCountThread aThread = new AddCountThread();
		Thread t1 = new Thread(aThread);
		Thread t2 = new Thread(aThread);
		Thread t3 = new Thread(aThread);
		Thread t4 = new Thread(aThread);
		Thread t5 = new Thread(aThread);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();*/
	}
}
