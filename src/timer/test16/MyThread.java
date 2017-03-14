package timer.test16;

public class MyThread extends Thread{

	@Override
	public void run() {
		super.run();
		System.out.println(MyObject.getMyObject());
	}
	
}
