package communication.test4;

public class MyThread2 extends Thread{

	private Object list;
	public MyThread2(Object list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		synchronized (list) {
			
			for (int i = 0; i < 10; i++) {
				MyList.add();
				if( MyList.getSize() == 5){
					list.notify();
					System.out.println("通知已经发出 notify time = "+System.currentTimeMillis());
				}
				System.out.println("添加了 "+(i+1)+"个元素");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
		}
	}
	
}
