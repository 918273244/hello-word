package communication.test7;

public class NotifyThread extends Thread{

	private Object lock;
	public NotifyThread(Object lock) {
		this.lock = lock;
	}

	public void run(){
		synchronized(lock){
			lock.notify();
		}
	}
	
}
