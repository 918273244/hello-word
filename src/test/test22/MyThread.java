package test.test22;

public class MyThread extends Thread {

	public volatile static int count;
	
	public static synchronized void addCount(){
		for (int i = 0; i <100; i++) {
			count++;
		}
		System.out.println("count = "+count);
	}
	
	@Override
	public void run() {
		super.run();
		addCount();
	}
	
}
