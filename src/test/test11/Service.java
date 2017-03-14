package test.test11;

public class Service {

	String s = new String();
	
	public  void printA(Object obj){
		try {
			synchronized (obj) {
				System.out.println(" printA begin threadName = "+Thread.currentThread().getName());
				Thread.sleep(5000);
				System.out.println(" printA end threadName = "+Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
