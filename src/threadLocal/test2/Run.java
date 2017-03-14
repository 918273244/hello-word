package threadLocal.test2;

public class Run {

	public static ThreadLocal t1 = new ThreadLocal();	
	
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		a.start();
		b.start();
		
			try {
				for (int i = 0; i < 100; i++) {
					Run.t1.set("Main "+(i+1));
					System.out.println("Main get Value = " + Run.t1.get());
				Thread.sleep(200);
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
