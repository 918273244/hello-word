package test.test4;

public class ThreadB extends Thread{

	private Service service;
	private  MyObject obj;
	
	
	public ThreadB(Service service, MyObject obj) {
		this.service = service;
		this.obj = obj;
	}
	
	@Override
	public void run() {
		super.run();
		service.printB();
	}
	
}
