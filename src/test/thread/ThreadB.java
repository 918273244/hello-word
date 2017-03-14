package test.thread;

public class ThreadB extends Thread{

	private HasSelfPrivetaNum num;
	private MyObject obj;
	private Sub sub;
	
	public ThreadB(Sub sub){
		this.sub = sub;
	}
	
	public ThreadB(HasSelfPrivetaNum num){
		this.num = num;
	}
	
	public ThreadB(MyObject obj){
		this.obj = obj;
	}
	
	@Override
	public void run() {
		/*try {
//			num.add("b");
//			obj.methodA();
			obj.methodB();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		sub.serviceMethod();
		sub.print();
	}
	
}
