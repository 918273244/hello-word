package test.test20;

public class RunThread extends Thread{

	private volatile boolean isRunning = true;
	
	
	@Override
	public void run() {
		super.run();
		System.out.println("进入 run 方法");
		while(isRunning == true){
			
		}
		System.out.println("线程被停止了");
	}


	public boolean isRunning() {
		return isRunning;
	}


	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
}
