package threadLocal.test4;

public class Run {

	public static ThreadLocalExt t1 = new ThreadLocalExt();
	
	public static void main(String[] args) {
		
//		try {
			if(t1.get() == null){
				System.out.println("从未放过值");
				t1.set("我的值");
			}
//		Thread.sleep(1000);
			System.out.println(t1.get());
			System.out.println(t1.get());
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	}
}
