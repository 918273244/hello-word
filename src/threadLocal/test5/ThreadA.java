package threadLocal.test5;

import java.util.Date;

public class ThreadA extends Thread{

	@Override
	public void run() {
		super.run();
		
			try {
			for (int i = 0; i < 20; i++) {
				System.out.println("ThreadA get Value = " + Tools.t1.get());
				Thread.sleep(200);
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
