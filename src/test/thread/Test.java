package test.thread;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		/*PublicVar var = new PublicVar();
		ThreadA a = new ThreadA(var);
		a.start();
		Thread.sleep(5000);
		var.getValue();*/
		
		/*MyThread t = new MyThread();
		t.start();*/
		
		/*Sub sub = new Sub();
		ThreadA a = new ThreadA(sub);
		a.setName("A");
		a.start();
		
		ThreadB b = new ThreadB(sub);
		b.setName("B");
		b.start();*/
		
		Task task = new Task();
		Mythread1 a = new Mythread1(task);
		a.start();
		Mythread2 b = new Mythread2(task);
		b.start();
		
			Thread.sleep(10000);
		
		long beginTime = CommonUtil.beginTime1;
		if(CommonUtil.beginTime2 < CommonUtil.beginTime1){
			beginTime = CommonUtil.beginTime2;
		}
		long endTime = CommonUtil.endTime1;
		if(CommonUtil.endTime2 > CommonUtil.endTime1){
			endTime = CommonUtil.endTime2;
		}
		System.out.println("共耗时:"+(endTime-beginTime)/1000+" 秒");
	}
	
}
