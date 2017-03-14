package piped.wait_notify_insert_test.test1;

public class BackUpB extends Thread{

	private DBTools dbTools;
	
	public BackUpB(DBTools dbTools) {
		this.dbTools = dbTools;
	}
	
	@Override
	public void run() {
		super.run();
		dbTools.backupB();
	}
	
}
