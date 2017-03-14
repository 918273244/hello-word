package reentrant.test11;

import java.util.concurrent.locks.ReentrantLock;

/**
 * int getHoldCount 查询当前线程保持此锁定的次数  也就是调用lock()方法的次数
 * @author Administrator
 *
 */
public class Service {

	private ReentrantLock lock = new ReentrantLock();
	
	public void serviceMethod1(){
		try{
			lock.lock();
			System.out.println("serviceMethod1 getHoldCount = "+lock.getHoldCount());
			serviceMethod2();
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
