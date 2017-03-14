package communication.test13;

public class ThreadB extends Thread{

	private Subtract sub;
	public ThreadB(Subtract sub) {
		this.sub = sub;
	}
	
	@Override
	public void run() {
		super.run();
		sub.subtract();
	}
	
}
