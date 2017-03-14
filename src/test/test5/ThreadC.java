package test.test5;

public class ThreadC extends Thread{

	private Service service;
	private  MyObject obj;
	
	
	public ThreadC(Service service, MyObject obj) {
		this.service = service;
		this.obj = obj;
	}
	
	@Override
	public void run() {
		super.run();
		service.printC();
	}
	
}
