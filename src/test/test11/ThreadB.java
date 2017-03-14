package test.test11;

public class ThreadB extends Thread{

private Service service;
	
	public ThreadB(Service service){
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.printA(service);
	}
	
}
