package piped.wait_notify_insert_test.test1;

public class Run {

	public static void main(String[] args) {
		DBTools dbTools = new DBTools();
		for (int i = 0; i < 20; i++) {
			BackUpA input = new BackUpA(dbTools);
			input.start();
			BackUpB outPut = new BackUpB(dbTools);
			outPut.start();
		}
	}

}
