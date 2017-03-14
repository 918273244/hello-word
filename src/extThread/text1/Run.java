package extThread.text1;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyObject obj = new MyObject();
		System.out.println("main 方法 1 状态"+obj.getState());
		Thread.sleep(1000);
		obj.start();
		Thread.sleep(1000);
		System.out.println("main 方法 2 状态"+obj.getState());
		
	}
	
}
