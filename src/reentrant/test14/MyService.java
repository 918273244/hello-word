package reentrant.test14;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	public ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void waitMethod(){
		if(lock.tryLock()){
			System.out.println(Thread.currentThread().getName()+" 获得锁");
		}else{
			System.out.println(Thread.currentThread().getName()+" 没有获得锁");
		}
	}
	
}
