package reentrant.test6;

public class Run {

	public static void main(String[] args) {
		try {
			MyService service = new MyService();
			ThreadA a = new ThreadA(service);
			a.setName("A");
			a.start();
			ThreadB b = new ThreadB(service);
			b.setName("B");
			b.start();
			Thread.sleep(3000);
			service.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
}
