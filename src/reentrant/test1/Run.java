package reentrant.test1;

public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();
		MyThread[] thread = new MyThread[5];
		for (int i = 0; i < thread.length; i++) {
			thread[i] = new MyThread(service);
			thread[i].setName(""+(i+1));
			thread[i].start();
		}
	}
	
}
