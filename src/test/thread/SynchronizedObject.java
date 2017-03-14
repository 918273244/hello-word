package test.thread;

public class SynchronizedObject {

	synchronized public void printString(){
		System.out.println("begin");
		if(Thread.currentThread().getName().equals("a")){
			System.out.println("a线程永远suspend");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
	}
	
}
