package communication.test15;

public class ThreadC extends Thread{

	private C c;
	public ThreadC(C c) {
		this.c=c;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true){
		c.popService();
		}
	}
	
}
