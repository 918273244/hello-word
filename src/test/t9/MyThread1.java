package test.t9;

public class MyThread1 extends Thread{

	private MyOneList list;
	
	public MyThread1(MyOneList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		Myservice service = new Myservice();
		service.addServiceMethod(list, "A");
	}
	
}
