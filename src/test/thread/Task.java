package test.thread;

public class Task {

	private String getData1;
	private String getData2;
	
	/*public synchronized void doLongTimeTask(){
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
			getData1 = "长时间处理后从远程返回的值 1 threadName = "+Thread.currentThread().getName();
			getData2 = "长时间处理后从远程返回的值 2 threadName = "+Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	*/
	
	public void doLongTimeTask(){
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
			String privateGetData1 = "长时间处理后从远程返回的值 1 threadName = "+Thread.currentThread().getName();
			String privateGetData2 = "长时间处理后从远程返回的值 2 threadName = "+Thread.currentThread().getName();
			
			synchronized (this) {
				getData1 = privateGetData1;
				getData2 = privateGetData2;
			}
			
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
