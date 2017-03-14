package communication.test5;

public class MyThread3 extends Thread{

	private Object list;
	public MyThread3(Object list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		Service service = new Service();
		service.synNotifyMethod(list);
	}
	
}
