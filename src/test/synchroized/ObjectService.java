package test.synchroized;

public class ObjectService {

	public void serviceMethod() {

		try {
			synchronized (this) {
				System.out
						.println("thread name = "+Thread.currentThread().getName()+" begin time = " + System.currentTimeMillis());
				Thread.sleep(5000);
				System.out
						.println("thread name = "+Thread.currentThread().getName()+" end time = " + System.currentTimeMillis());

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void serviceMethodA(){
		try {
			synchronized (this) {
				System.out.println("A begin time = "+System.currentTimeMillis());
					Thread.sleep(2000);
				System.out.println("A end time = "+System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void serviceMethodB(){
		synchronized (this) {
			System.out.println("B begin time = "+System.currentTimeMillis());
			System.out.println("B end time = "+System.currentTimeMillis());
		}

	}

}
