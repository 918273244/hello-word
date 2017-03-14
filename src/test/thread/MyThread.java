package test.thread;

public class MyThread extends Thread{
	
	private long i = 0;

	 public void run(){
		/*while(true){
			i++;
			if(this.isInterrupted()){
				System.out.println("停止了");
				return;
			}
		}*/
		 
		/* Service service = new Service();
		 service.service1();*/
		 Sub sub = new Sub();
		 sub.operateISubMethod();
		 
	}

	public long getI() {
		return i;
	}

	public void setI(long i) {
		this.i = i;
	}
	
}
