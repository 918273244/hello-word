package test.synchroized;

public class Run {

	public static void main(String[] args) {
		ObjectService service = new ObjectService();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		
		/*Task task = new Task();
		MyThread1 a = new MyThread1(task);
		a.setName("A");
		a.start();
		MyThread2 b = new MyThread2(task);
		b.setName("B");
		b.start();*/
	}
	
}
