package reentrant.test2;

public class ThreadBB extends Thread{

	private MyService service;
	
	public ThreadBB(MyService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.methodB();
	}
}
