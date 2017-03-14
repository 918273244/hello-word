package test.syn_Out_asyn;


public class Run {

	public static void main(String[] args) {
		MyList list = new MyList();
		ThreadA a = new ThreadA(list);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(list);
		b.setName("B");
		b.start();
		try {
			Thread.sleep(10000);
			System.out.println(list.getSize());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
