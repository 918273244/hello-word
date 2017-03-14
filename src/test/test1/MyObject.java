package test.test1;

public class MyObject {

	public synchronized void speedPrintString(){
		System.out.println("speedPrintString ____getLock time = "
				+ System.currentTimeMillis() + " threadName = "
				+ Thread.currentThread().getName());

		System.out.println("-------------------------");
		
		System.out.println("speedPrintString releaseLock time = "
				+ System.currentTimeMillis() + " threadName = "
				+ Thread.currentThread().getName());
	}
	
}
