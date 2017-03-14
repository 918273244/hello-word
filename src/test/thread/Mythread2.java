package test.thread;

public class Mythread2 extends Thread{

	private Task task;
	
	public Mythread2(Task task){
		super();
		this.task = task;
	}
	
	@Override
	public void run() {
		super.run();
		CommonUtil.beginTime2 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtil.endTime2 = System.currentTimeMillis();
		
	}
	
}
