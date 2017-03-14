package test.test10;

public class DealThread implements Runnable {

	private String username;
	public Object lock1 = new Object();
	public Object lock2 = new Object();

	public void setFlag(String username) {
		this.username = username;
	}

	@Override
	public void run() {

		if (username.equals("A")) {
			synchronized (lock1) {
				try {
					System.out.println("username = " + username);

					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (lock2) {
					System.out.println("按lock1->lock2 代码按照顺序执行了");
				}
			}
		}
		if("B".equals(username)){
			synchronized (lock2) {
				try {
					System.out.println("username = " + username);

					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (lock1) {
					System.out.println("按lock2->lock1 代码按照顺序执行了");
				}
			}
		}

	}

}
