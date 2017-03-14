package test.thread;

public class ThreadA extends Thread{

	private HasSelfPrivetaNum num;
	private MyObject obj;
	private PublicVar var;
	private Sub sub;
	public ThreadA(HasSelfPrivetaNum num){
		this.num = num;
	}
	public ThreadA(PublicVar var){
		this.var = var;
	}
	
	public ThreadA(MyObject obj){
		this.obj = obj;
	}
	
	
	public ThreadA(Sub sub){
		this.sub = sub;
	}
	
	
	
	@Override
	public void run() {
		/*try {
//			num.add("a");
//			obj.methodA();
//			obj.methodB();
			var.setValue("B", "BB");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		sub.serviceMethod();
		sub.print();
	}
}
