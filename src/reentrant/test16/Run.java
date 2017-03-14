package reentrant.test16;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


/**
 * condition实现顺序执行
 * @author Administrator
 *
 */
public class Run {

	volatile private static int nextPointWho = 1;
	private static ReentrantLock lock = new ReentrantLock();
	final static private Condition con1 = lock.newCondition();
	final static private Condition con2 = lock.newCondition();
	final static private Condition con3 = lock.newCondition();
	public static void main(String[] args) throws InterruptedException {
		Thread threadA = new Thread(){
			@Override
			public void run() {
				super.run();
					try {
						lock.lock();
						while(nextPointWho != 1){
						con1.await();
						}
						for (int i = 0; i < 3; i++) {
							System.out.println("ThreadA = "+(i+1));
						}
						nextPointWho = 2;
						con2.notifyAll();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
			}
		};
		Thread threadB = new Thread(){
			@Override
			public void run() {
				super.run();
				try {
					lock.lock();
					while(nextPointWho != 2){
						con2.await();
					}
					for (int i = 0; i < 3; i++) {
						System.out.println("ThreadB = "+(i+1));
					}
					nextPointWho = 3;
					con3.notifyAll();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
			}
		};
		Thread threadC = new Thread(){
			@Override
			public void run() {
				super.run();
				try {
					lock.lock();
					while(nextPointWho != 3){
						con3.await();
					}
					for (int i = 0; i < 3; i++) {
						System.out.println("ThreadC = "+(i+1));
					}
					nextPointWho = 3;
					con1.notifyAll();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
			}
		};
		Thread[] aArray = new Thread[5];
		Thread[] bArray = new Thread[5];
		Thread[] cArray = new Thread[5];
		for (int i = 0; i < 5; i++) {
			aArray[i] = new Thread(threadA);
			bArray[i] = new Thread(threadB);
			cArray[i] = new Thread(threadC);
			aArray[i].start();
			bArray[i].start();
			cArray[i].start();
		}
	}
	
}
