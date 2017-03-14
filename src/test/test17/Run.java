package test.test17;


public class Run {

	/**
	 * 内部类与同步：锁对象改变
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		UserInfo user = new UserInfo();
		
		ThreadA a = new ThreadA(service, user);
		a.setName("A");
		ThreadB b = new ThreadB(service, user);
		b.setName("B");
		a.start();
		Thread.sleep(500);
		b.start();
		
		
		
	}
	
}
