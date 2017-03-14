package test.test20;


public class Run {

	/**
	 * 内部类与同步：停止线程
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		RunThread thread = new RunThread();
		thread.start();
		Thread.sleep(1000);
		thread.setRunning(false);
		System.out.println("已经赋值为false");
		
	}
	
}
