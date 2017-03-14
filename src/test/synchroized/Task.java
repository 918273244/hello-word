package test.synchroized;

public class Task {

	public void doLongTimeTask(){
		
		for(int i = 0; i<100; i++){
			System.out.println("nosynchronized thread name = "+Thread.currentThread().getName()+" i = "+(i+1));
		}
		System.out.println("");
		synchronized (this) {
			for(int i = 0; i<100; i++){
				System.out.println("synchronized thread name = "+Thread.currentThread().getName()+" i = "+(i+1));
			}
		}
	}
	
	public void otherMethod(){
		System.out.println("run -----------------otherMethod---------------");
	}
}
