package communication.test19;

import communication.test18.C;
import communication.test18.MyStack;
import communication.test18.P;
import communication.test18.ThreadC;
import communication.test18.ThreadP;

public class Run {

	/**
	 * 多个生产者多个消费者
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		MyStack mystack = new MyStack();
		C c1 = new C(mystack);
		C c2 = new C(mystack);
		C c3 = new C(mystack);
		C c4 = new C(mystack);
		P p1 = new P(mystack);
		P p2 = new P(mystack);
		P p3 = new P(mystack);
		P p4 = new P(mystack);
		ThreadP threadP1 = new ThreadP(p1);
		ThreadP threadP2 = new ThreadP(p2);
		ThreadP threadP3 = new ThreadP(p3);
		ThreadP threadP4 = new ThreadP(p4);
		threadP1.start();
		threadP2.start();
		threadP3.start();
		threadP4.start();
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
