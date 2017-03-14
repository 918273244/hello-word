package reentrant.test7;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	private Condition conditionA = lock.newCondition();
	private Condition conditionB = lock.newCondition();


	public void signalAll_A(){
		try{
			lock.lock();
			System.out.println("signalAll 时间 "+System.currentTimeMillis()+" ThreadName = "+Thread.currentThread().getName());
			conditionA.signalAll();
		}finally{
			lock.unlock();
		}
		
	}
	
	public void signalAll_B(){
		try{
			lock.lock();
			System.out.println("signalAll 时间 "+System.currentTimeMillis()+" ThreadName = "+Thread.currentThread().getName());
			conditionB.signalAll();
		}finally{
			lock.unlock();
		}
		
	}
	
	public void awaitA(){
		try {
			lock.lock();
			System.out.println("begin awaitA 时间 "+System.currentTimeMillis()+" ThreadName = "+Thread.currentThread().getName());
			conditionA.await();
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
			conditionB.await();
			System.out.println("end awaitB 时间 "+System.currentTimeMillis()+" ThreadName = "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
}
