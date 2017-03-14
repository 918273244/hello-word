package test.test11;


public class ThreadA extends Thread{

	private Service service;
	
	public ThreadA(Service service){
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.printA(service);
	}
	
}
