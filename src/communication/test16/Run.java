package communication.test16;

public class Run {

	/**
	 * 一个生产者一个消费者
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		String lock = new String("");
		C c = new C(lock);
		P p = new P(lock);
		ThreadP[] threadP = new ThreadP[2];
		ThreadC[] threadC = new ThreadC[2];
		for (int i = 0; i < threadC.length; i++) {
			threadP[i] = new ThreadP(p);
			threadP[i].setName("生产者："+(i+1));
			threadC[i] = new ThreadC(c);
			threadC[i].setName("消费者："+(i+1));
			threadP[i].start();
			threadC[i].start();
		}
		Thread.sleep(5000);
		Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for (int i = 0; i < threadArray.length; i++) {
			System.out.println(threadArray[i].getName()+" "+threadArray[i].getState());
		}
	}
	
}
