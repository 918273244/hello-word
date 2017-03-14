package test.test21;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread{

	private AtomicInteger count= new AtomicInteger(0);
	
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 10000; i++) {
			System.out.println("ThreadName = "+Thread.currentThread().getName()+" count = "+count.incrementAndGet());
		}
	}
	
}
