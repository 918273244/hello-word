package communication.test14;

/**
 * 消费者
 * @author Administrator
 *
 */
public class C {

	private String lock;
	public C(String lock) {
		this.lock = lock;
	}
	
	public void getValue(){
		try {
		synchronized (lock) {
//			System.out.println("C : "+ValueObject.value.equals(""));
			if(ValueObject.value.equals("")){
					lock.wait();
			}
			System.out.println("get 的值是 "+ValueObject.value);
			ValueObject.value = "";
			lock.notify();
			
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
