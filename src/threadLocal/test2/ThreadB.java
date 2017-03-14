package threadLocal.test2;

public class ThreadB extends Thread{

	@Override
	public void run() {
		super.run();
		
			try {
			for (int i = 0; i < 100; i++) {
				Run.t1.set("ThreadB " + (i + 1));
				System.out.println("ThreadB get Value = " + Run.t1.get());
				Thread.sleep(200);
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
