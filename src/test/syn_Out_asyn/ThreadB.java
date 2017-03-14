package test.syn_Out_asyn;

public class ThreadB extends Thread{

private MyList list;
	
	public ThreadB(MyList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		for(int i = 0; i<100000; i++){
			list.add("threadB "+(i+1));
		}
	}
	
}
