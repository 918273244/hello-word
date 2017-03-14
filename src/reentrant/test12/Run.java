package reentrant.test12;

import reentrant.test9.ThreadB;


/**
 * int getHoldCount 查询当前线程保持此锁定的次数  也就是调用lock()方法的次数
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service();
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				service.serviceMethod1();
			}
		};
		
		Thread[] t = new Thread[10];
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(run);
		}
		for (int i = 0; i < t.length; i++) {
			t[i].start();
		}
		Thread.sleep(2000);
		System.out.println("有线程数 = "+service.lock.getQueueLength());
	}
	
}
