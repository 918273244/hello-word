package reentrant.test12;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	ReentrantLock lock = new ReentrantLock();
	
	public void serviceMethod1(){
		try{
			lock.lock();
			System.out.println("thrad name = "+Thread.currentThread().getName()+" 进入方法");
				Thread.sleep(Integer.MAX_VALUE);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	
	public void serviceMethod2(){
		try{
			lock.lock();
			System.out.println("serviceMethod2 getHoldCount = "+lock.getHoldCount());
		}finally{
			lock.unlock();
		}
		
	}
	
}
