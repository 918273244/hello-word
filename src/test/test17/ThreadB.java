package test.test17;

public class ThreadB extends Thread{

	private Service service;
	private UserInfo user;
	public ThreadB(Service service, UserInfo user) {
		this.service = service;
		this.user = user;
	}
	
	@Override
	public void run() {
		super.run();
		service.serviceMethodA(user);;
	}
}
