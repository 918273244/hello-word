package reentrant.test8;

/**
 * condition一对一  消费
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) {
			MyService service = new MyService();
			ThreadA a = new ThreadA(service);
			a.setName("A");
			a.start();
			ThreadB b = new ThreadB(service);
			b.setName("B");
			b.start();
//			
	
	}
	
}
