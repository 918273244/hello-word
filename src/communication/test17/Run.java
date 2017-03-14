package communication.test17;

public class Run {

	/**
	 * 一个生产者多个消费者
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		MyStack mystack = new MyStack();
		C c1 = new C(mystack);
		C c2 = new C(mystack);
		C c3 = new C(mystack);
		C c4 = new C(mystack);
		P p = new P(mystack);
		ThreadP threadP = new ThreadP(p);
		threadP.start();
		ThreadC threadC1 = new ThreadC(c1);
		ThreadC threadC2 = new ThreadC(c2);
		ThreadC threadC3 = new ThreadC(c3);
		ThreadC threadC4 = new ThreadC(c4);
		threadC1.start();
		threadC2.start();
		threadC3.start();
		threadC4.start();
	}
	
}
