package test.test1;


public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		MyObject obj = new MyObject();
		MyObject obj1 = new MyObject();
		ThreadA a = new ThreadA(service, obj);
		a.setName("A");
		a.start();
		Thread.sleep(100);
		ThreadB b = new ThreadB(service, obj);
		b.setName("B");
		b.start();
		
	}
	
}
