package test.test5;

public class ThreadA extends Thread{

	private Service service;
	private  MyObject obj;
	
	
	public ThreadA(Service service, MyObject obj) {
		this.service = service;
		this.obj = obj;
	}
	
	@Override
	public void run() {
		super.run();
		service.printA();;
	}
	
}
