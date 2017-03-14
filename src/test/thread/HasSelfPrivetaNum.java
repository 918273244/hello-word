package test.thread;

public class HasSelfPrivetaNum {

	private int num = 0;
	synchronized public void add(String username) throws InterruptedException{
		if("a".equals(username)){
			num = 100;
			System.out.println("a set over!");
			Thread.sleep(2000);
		}else{
			num = 200;
			System.out.println("b set over!");
		}
		System.out.println(username+",num = "+num);
	}
	
}
