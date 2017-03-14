package communication.test14;

public class Run {

	/**
	 * 一个生产者一个消费者
	 * @param args
	 */
	
	public static void main(String[] args) {
		String lock = new String("");
		C c = new C(lock);
		P p = new P(lock);
		ThreadP threadP = new ThreadP(p);
		ThreadC threadC = new ThreadC(c);
		threadP.start();
		threadC.start();
	}
	
}
