package reentrant.test10;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 公平锁与非公平锁
 * @author Administrator
 *
 */
public class Service {

	private ReentrantLock lock;
	public Service(boolean isFair) {
		lock = new ReentrantLock(isFair);
	}
	
	public void setMethod(){
		try{
			lock.lock();
			System.out.println("Thread name = "+Thread.currentThread().getName()+" 时间 = "+System.currentTimeMillis()+" 获得锁");
		}finally{
			lock.unlock();
		}
		
	}
	
}
