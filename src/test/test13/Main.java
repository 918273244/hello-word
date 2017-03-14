package test.test13;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		for(int i = 0; i < 100; i++){
			new Thread(t).start();
		}
//		Thread.sleep(100);
		System.out.println(t.num);
	}
	
}

class MyThread implements Runnable{
	
	public volatile long num = 0l;


	@Override
	public void run() {
		add();
	}
	
	public  void add(){
		this.num = this.num +1l;
	}
}
