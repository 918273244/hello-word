package test.synchroized2;

public class Run {

	public static void main(String[] args) {
		try {
			Task task = new Task();
			MyThread1  a = new MyThread1(task);
			a.start();
			Thread.sleep(100);
			MyThread2 b = new MyThread2(task);
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
