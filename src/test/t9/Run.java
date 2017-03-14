package test.t9;


public class Run {

	public static void main(String[] args) {
		MyOneList list = new MyOneList();
		MyThread1 a = new MyThread1(list);
		a.setName("A");
		a.start();
		MyThread2 b = new MyThread2(list);
		b.setName("B");
		b.start();
		try {
			Thread.sleep(6000);
			System.out.println(list.getSize());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
