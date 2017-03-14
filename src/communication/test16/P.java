package communication.test16;

public class P {

	/**
	 * 生产者
	 */
	private String lock;
	
	public P(String lock) {
		this.lock = lock;
	}
	
	public void setValue(){
		try {
		synchronized (lock) {
//			System.out.println("P : "+!ValueObject.value.equals(""));
			if(!ValueObject.value.equals("")){
				System.out.println("生产者"+Thread.currentThread().getName()+" WAITTING了");
					lock.wait();
			}
			String value = System.currentTimeMillis()+"_"+System.nanoTime();
			System.out.println("生产者"+Thread.currentThread().getName()+" RUNNABLE了");
			ValueObject.value = value;
			lock.notifyAll();
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
