package reentrant.test5;

public class Run {

	public static void main(String[] args) {
		try {
			MyService service = new MyService();
			ThreadA a = new ThreadA(service);
			a.setName("A");
			a.start();
			Thread.sleep(3000);
			service.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
}
