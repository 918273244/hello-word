package extThread.text1;

public class MyObject extends Thread{

	public MyObject() {
		System.out.println("构造方法状态"+Thread.currentThread().getState());
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("run方法状态"+Thread.currentThread().getState());
	}
	
}
