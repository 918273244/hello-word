package test.thread;

public class Mythread1 extends Thread{

	private Task task;
	
	public Mythread1(Task task){
		super();
		this.task = task;
	}
	
	@Override
	public void run() {
		CommonUtil.beginTime1 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtil.endTime1 = System.currentTimeMillis();
		
	}
	
}
