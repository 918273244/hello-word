package communication.test4;

public class MyThread1 extends Thread{

	private Object list;
	public MyThread1(Object list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		try {
		synchronized (list) {
			if(MyList.getSize() != 5){
				
				System.out.println(" wait begin time = "+System.currentTimeMillis());
				
				list.wait();
					System.out.println(" wait end time = "
							+ System.currentTimeMillis());
			}
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
