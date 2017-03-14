package piped.wait_notify_insert_test.test5;

public class ThreadB extends Thread{

	@Override
	public void run() {
		super.run();
		
		ThreadA t = new ThreadA();
		t.start();
		try {
			t.join();
			System.out.println("b 线程  end");
		} catch (InterruptedException e) {
			System.out.println("b 线程  catch");
			e.printStackTrace();
		}
	}
	
}
