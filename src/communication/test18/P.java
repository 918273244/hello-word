package communication.test18;

public class P {

	/**
	 * 生产者
	 */
	
	private MyStack mystack;
	
	public P(MyStack mystack) {
		this.mystack = mystack;
	}
	
	public void pushService(){
		mystack.push();
	}
}
