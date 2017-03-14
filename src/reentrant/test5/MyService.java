package reentrant.test5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void waitMethod(){
		try {
			lock.lock();
			System.out.println("A");
			condition.await();
			System.out.println("B");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
			System.out.println("锁被释放了");
		}
	}

	public void signal(){
		try{
			lock.lock();
			System.out.println("signal 时间 = "+System.currentTimeMillis());
			condition.signal();
		}finally{
			lock.unlock();
		}
		
	}
	
}
