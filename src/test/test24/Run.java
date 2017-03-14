package test.test24;


public class Run {

	/**
	 * volatile 原子性
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.start();
		
		Thread.sleep(2000);
		ThreadB b = new ThreadB(service);
		b.start();
		System.out.println("已经发起停止命令");
	}
}
