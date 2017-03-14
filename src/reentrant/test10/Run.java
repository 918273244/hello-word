package reentrant.test10;

import reentrant.test9.ThreadB;

/**
 * 公平锁与非公平锁
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) {
//		final Service service = new Service(true);//公平锁
		final Service service = new Service(false);//非公平锁
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("♦线程 "+Thread.currentThread().getName()+" 运行了");
				service.setMethod();
			}
		};
		
		Thread[] t = new Thread[10];
		for (int i = 0; i < 10; i++) {
			t[i] = new Thread(run);
		}
		for (int i = 0; i < 10; i++) {
			t[i].start();
		}
		
	}
	
}
