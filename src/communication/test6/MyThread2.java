package communication.test6;

public class MyThread2 extends Thread{

	private Object list;
	public MyThread2(Object list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		Service service = new Service();
		service.testMethod(list);
	}
	
}
