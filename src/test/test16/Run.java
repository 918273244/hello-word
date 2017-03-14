package test.test16;


public class Run {

	/**
	 * 内部类与同步：锁对象改变
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		ThreadB b = new ThreadB(service);
		b.setName("B");
		a.start();
//		Thread.sleep(500);
		b.start();
		
		
		
	}
	
}
