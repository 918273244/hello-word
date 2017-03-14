package test.thread;

public class MyObject {

	synchronized public void methodA() throws InterruptedException{
		System.out.println("begin methodA threadName = "+Thread.currentThread().getName());
		Thread.sleep(5000);
		System.out.println("end endTime = "+System.currentTimeMillis());
	}
	
	synchronized public void methodB() throws InterruptedException{
		System.out.println("begin methodB threadName = "+Thread.currentThread().getName()+" begin time = "+System.currentTimeMillis());
		Thread.sleep(5000);
		System.out.println("end");
	}
	
}
