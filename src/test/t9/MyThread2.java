package test.t9;

public class MyThread2 extends Thread {

	private MyOneList list;

	public MyThread2(MyOneList list) {
		this.list = list;
	}

	@Override
	public void run() {
		super.run();
		Myservice service = new Myservice();
		service.addServiceMethod(list, "B");
	}

}
