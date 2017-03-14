package test.test2;


public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		MyObject obj = new MyObject();
		MyObject obj1 = new MyObject();
		ThreadA a = new ThreadA(service, obj);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service, obj1);
		b.setName("B");
		b.start();
		
	}
	
}
