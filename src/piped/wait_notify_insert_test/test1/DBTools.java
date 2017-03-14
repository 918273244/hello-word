package piped.wait_notify_insert_test.test1;

/**
 * 20个线程：10个线程备份A  10个线程备份B
 * @author Administrator
 *
 */
public class DBTools {

	volatile private boolean prveIsA = false;
	
	synchronized public void backupA(){
			try {
				while(prveIsA == true){
				wait();
			}
				for (int i = 0; i < 5; i++) {
					System.out.println("＄＄＄A＄＄＄");
				}
				prveIsA = true;
				notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized public void backupB(){
		try {
		while(prveIsA == false){
				wait();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("＆＆＆B＆＆＆");
		}
		prveIsA = false;
		notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
