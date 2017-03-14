package test.test9;

public class Service {


	public synchronized void printA() {
		try {
			System.out.println("printA begin");
			boolean is = true;
			while(is){
				
				Thread.sleep(1);
			}
			System.out.println("printA end");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized  void printB() {
		System.out.println("printB begin");
		System.out.println("printB end");
	}

}
