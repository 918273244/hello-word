package test.test18;


public class Run {

	/**
	 * 内部类与同步：锁对象改变
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		PringString printService = new PringString();
		printService.printStringMethod();
		System.out.println("我要停止它! stopThread="+Thread.currentThread().getName());
		printService.setContinuePrint(false);
	}
	
}
