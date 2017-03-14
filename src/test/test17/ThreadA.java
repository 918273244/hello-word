package test.test17;

public class ThreadA extends Thread{

	private Service service;
	private UserInfo user;
	public ThreadA(Service service, UserInfo user) {
		this.service = service;
		this.user = user;
	}
	
	@Override
	public void run() {
		super.run();
		service.serviceMethodA(user);;
	}
}
