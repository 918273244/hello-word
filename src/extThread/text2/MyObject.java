package extThread.text2;

public class MyObject extends Thread{

	public MyObject() {
//		System.out.println("构造方法状态"+Thread.currentThread().getState());
	}
	
	@Override
	public void run() {
		super.run();
		
		System.out.println("run方法 begin"+Thread.currentThread().getState());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run方法 end"+Thread.currentThread().getState());
	}
	
}
