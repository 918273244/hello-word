package communication.test15;

public class Run {

	/**
	 * 一个生产者一个消费者
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		MyStack mystack = new MyStack();
		C c = new C(mystack);
		P p = new P(mystack);
		ThreadP threadP = new ThreadP(p);
		ThreadC threadC = new ThreadC(c);
		threadP.start();
		threadC.start();
	}
	
}
