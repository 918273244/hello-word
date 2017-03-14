package test.synBlockString;

public class Service {

	private String usernameParam;
	private String passwordParam;
	String anyString = new String();

	public void setUsernamePassword(String username, String password) {
		try {
			synchronized (anyString) {
				System.out.println("线程 " + Thread.currentThread().getName()
						+ " 在 " + System.currentTimeMillis() + " 进入同步代码块");
				usernameParam = username;

				Thread.sleep(3000);
				passwordParam = password;
				System.out.println("线程 " + Thread.currentThread().getName()
						+ " 在 " + System.currentTimeMillis() + " 离开同步代码块");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
