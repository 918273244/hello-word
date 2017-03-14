package test.thread;

public class PublicVar {

	private String username = "A";
	private String password = "AA";
	
	public void setValue(String username, String password) throws InterruptedException{
		this.username = username;
		Thread.sleep(5000);
		this.password = password;
		System.out.println("setValue method thread name "+Thread.currentThread().getName()+" userName = "+username+" password = "+password);
		
	}
	
 	synchronized public void getValue(){
		System.out.println("getValue method thread name "+Thread.currentThread().getName()+" userName = "+username+" password = "+password);

	}
}
