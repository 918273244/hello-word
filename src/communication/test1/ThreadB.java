package communication.test1;

public class ThreadB extends Thread{

private MyList list;
	
	public ThreadB(MyList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		while(true){
			if(list.getSize() == 5){
				System.out.println("== 5 了，线程b要退出了");
				try {
					throw new InterruptedException();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
