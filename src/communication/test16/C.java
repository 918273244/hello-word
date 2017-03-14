package communication.test16;

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
				System.out.println("消费者 "+Thread.currentThread().getName()+" WAITTING了");
					lock.wait();
			}
			System.out.println("消费者 "+Thread.currentThread().getName()+" RUNNABLE了");
			ValueObject.value = "";
			lock.notifyAll();
			
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
