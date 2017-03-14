package communication.test13;

public class Run {

	public static void main(String[] args) {
		String lock = new String("");
		Add add = new Add(lock);
		Subtract sub = new Subtract(lock);
		ThreadB subT = new ThreadB(sub);
		subT.setName("subT 1 ");
		subT.start();
		ThreadB subT2 = new ThreadB(sub);
		subT.setName("subT 2 ");
		subT2.start();
		try {
			Thread.sleep(2000);
			ThreadA a = new ThreadA(add);
			a.setName("add");
			a.start();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
