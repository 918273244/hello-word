package test.thread;

public class Sub extends Main{

	
	synchronized public void operateISubMethod(){
		while(i>0){
			try {
				i--;
				System.out.println("sub public i = "+i);
				Thread.sleep(1000);
				this.operateIMainMethod();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	 public synchronized void serviceMethod() {
		super.serviceMethod();
		try {
			System.out.println("int sub 下一步 sleep begin threadName = "+Thread.currentThread().getName() + " time "+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int sub 下一步 sleep end threadName = "+Thread.currentThread().getName() + " time "+System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	@Override
	public void print() {

		System.out.println("sub method");
	}
	
}
