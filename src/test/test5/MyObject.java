package test.test5;

public class MyObject {
	public  void speedPrintString(){
		synchronized (this) {
			
			System.out.println("speedPrintString ____getLock time = "
					+ System.currentTimeMillis() + " threadName = "
					+ Thread.currentThread().getName());
			
			System.out.println("-------------------------");
			
			System.out.println("speedPrintString releaseLock time = "
					+ System.currentTimeMillis() + " threadName = "
					+ Thread.currentThread().getName());
		}
	}
	
}
