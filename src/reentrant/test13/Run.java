package reentrant.test13;


/**
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) throws InterruptedException {
		
		final MyService service = new MyService();
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				service.waitMethod();
			}
		};
		
		Thread a = new Thread(run);
		a.setName("A");
		a.start();
		Thread.sleep(5000);
		Thread b = new Thread(run);
		b.setName("B");
		b.start();
		b.interrupt();
		System.out.println("main end");
	}
	
}
