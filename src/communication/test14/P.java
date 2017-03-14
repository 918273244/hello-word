package communication.test14;

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
					lock.wait();
			}
			String value = System.currentTimeMillis()+"_"+System.nanoTime();
			System.out.println("set 的值是 "+value);
			ValueObject.value = value;
			lock.notify();
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
