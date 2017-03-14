package reentrant.test13;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	public ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void waitMethod(){
		try{
			lock.lock();
			System.out.println("lock begin "+Thread.currentThread().getName());
			for (int i = 0; i < 20000000; i++) {
				String s = new String();
				Math.random();
			}
			System.out.println("lock end "+Thread.currentThread().getName());
		}finally{
			lock.unlock();
		}
		
	}
	
}
