package communication.test13;

public class ThreadA extends Thread{

	private Add add;
	
	public ThreadA(Add add) {
		this.add = add;
	}
	
	@Override
	public void run() {
		super.run();
		add.add();
	}
	
}
