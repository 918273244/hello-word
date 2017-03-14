package threadLocal.test3;

import java.util.Date;

public class ThreadA extends Thread{

	@Override
	public void run() {
		super.run();
		
			try {
			for (int i = 0; i < 20; i++) {
				if(Tools.t1.get() == null){
					Tools.t1.set(new Date());
				}
				System.out.println("ThreadA get Value = " + Tools.t1.get().getTime());
				Thread.sleep(200);
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
