package timer.test17;

public class MyThread extends Thread{

	@Override
	public void run() {
		super.run();
		System.out.println(MyObject.getMyObject());
	}
	
}
