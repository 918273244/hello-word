package communication.test18;

/**
 * 消费者
 * @author Administrator
 *
 */
public class C {
private MyStack mystack;
	
	public C(MyStack mystack) {
		this.mystack = mystack;
	}
	
	public void popService(){
		System.out.println("pop = "+mystack.pop());
	}
	
	
}
