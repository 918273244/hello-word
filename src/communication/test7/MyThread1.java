package communication.test7;

public class MyThread1 extends Thread{

	private Object list;
	public MyThread1(Object list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		Service service = new Service();
		service.testMethod(list);
	}
	
}
