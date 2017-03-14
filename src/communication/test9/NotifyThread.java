package communication.test9;

public class NotifyThread extends Thread{

	private Object lock;
	public NotifyThread(Object lock) {
		this.lock = lock;
	}

	public void run(){
		synchronized(lock){
			/*lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();
			lock.notify();*/
			lock.notifyAll();
		}
	}
	
}
