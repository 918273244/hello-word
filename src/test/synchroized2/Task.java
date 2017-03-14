package test.synchroized2;

public class Task {

	public void doLongTimeTask(){
		
		synchronized (this) {
			for(int i = 0; i<10000; i++){
				System.out.println("synchronized thread name = "+Thread.currentThread().getName()+" i = "+(i+1));
			}
		}
	}
	
	public synchronized void otherMethod(){
		System.out.println("run -----------------otherMethod---------------");
	}
}
