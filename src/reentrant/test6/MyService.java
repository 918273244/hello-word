package reentrant.test6;

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
			System.out.println("signalAll 时间 "+System.currentTimeMillis()+" ThreadName = "+Thread.currentThread().getName());
			condition.signalAll();
		}finally{
			lock.unlock();
		}
		
	}
	
	public void awaitA(){
		try {
			lock.lock();
			System.out.println("begin awaitA 时间 "+System.currentTimeMillis()+" ThreadName = "+Thread.currentThread().getName());
			condition.await();
			System.out.println("end awaitA 时间 "+System.currentTimeMillis()+" ThreadName = "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	public void awaitB(){
		try {
			lock.lock();
			System.out.println("begin awaitB 时间 "+System.currentTimeMillis()+" ThreadName = "+Thread.currentThread().getName());
			condition.await();
			System.out.println("end awaitB 时间 "+System.currentTimeMillis()+" ThreadName = "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
}
