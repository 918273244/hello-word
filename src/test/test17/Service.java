package test.test17;

public class Service {

	public void serviceMethodA(UserInfo user){
			try {
				synchronized (user) {
				System.out.println(Thread.currentThread().getName());
				user.setUserName("aaaaa");
				Thread.sleep(3000);
				System.out.println("end Time = "+System.currentTimeMillis());
				
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
