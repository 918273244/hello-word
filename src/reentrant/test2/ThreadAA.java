package reentrant.test2;

public class ThreadAA extends Thread{

	private MyService service;
	
	public ThreadAA(MyService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.methodA();
	}
}
