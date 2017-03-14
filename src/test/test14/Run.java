package test.test14;

import test.test14.OutClass.Inner;



public class Run {

	/**
	 * 内部类与同步：实验1
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
	
		final Inner inner = new Inner();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				inner.method1();
			}
		},"A");
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				inner.method2();
			}
		},"B");
		t1.start();
		t2.start();
	}
	
}
