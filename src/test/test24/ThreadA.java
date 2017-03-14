package test.test24;

public class ThreadA extends Thread {

	private Service service;
	public ThreadA( Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.runMethod();
	}
	
}
