package test.thread;

import org.junit.Test;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		HasSelfPrivetaNum has1 = new HasSelfPrivetaNum();
		HasSelfPrivetaNum has2 = new HasSelfPrivetaNum();
		MyObject obj = new MyObject();
		ThreadA a = new ThreadA(obj);
		a.setName("A");
		ThreadB b = new ThreadB(obj);
		b.setName("B");
		a.start();
		b.start();
	}
	
//	@Test
	public void test1(){
		CountOperate counO = new CountOperate();
		Thread t = new Thread(counO);
		System.out.println("main begin = "+t.isAlive());
		t.setName("A");
		t.start();
		System.out.println("main end = "+t.isAlive());
	}
	
//	@Test
	public void test2(){
		Thread c = Thread.currentThread();
		System.out.println(c.getName()+" : "+c.getId());
	}
	
//	@Test
	public void test3() {
		MyThread m = new MyThread();
//		Thread t = new Thread(m);
		m.start();
		try {
			Thread.sleep(500);
			m.interrupt();
			System.out.println("是否停止1 "+m.isInterrupted());
			System.out.println("是否停止2 "+m.isInterrupted());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("test3 end");
		
	}
	
//	@Test
	public void test4(){
		Thread.currentThread().interrupt();
		System.out.println("是否停止1 "+Thread.interrupted());
		System.out.println("是否停止2 "+Thread.interrupted());
	}
	
//	@Test
	public void test5() {
		MyThread m = new MyThread();
		Thread t = new Thread(m);
		t.start();
		try {
			Thread.sleep(1000);
			t.interrupt();
			System.out.println("是否停止1 "+t.isInterrupted());
			System.out.println("是否停止2 "+t.isInterrupted());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("test5 end");
		
	}
	
//	@Test
	public void test6() throws InterruptedException{
		MyThread m = new MyThread();
		m.start();
		Thread.sleep(300);
//		m.interrupt();
		m.stop();
		System.out.println("是否停止1 "+m.isInterrupted());
		System.out.println("是否停止2 "+m.isInterrupted());
		
	}
//	@Test
	public void test7() throws InterruptedException{
		MyThread m = new MyThread();
		m.start();
		Thread.sleep(3000);
		m.interrupt();
		System.out.println("是否停止1 "+m.isInterrupted());
		System.out.println("是否停止2 "+m.isInterrupted());
		
	}
	
//	@Test
	public void test8() throws InterruptedException{
		MyThread m = new MyThread();
		m.start();
		Thread.sleep(3000);
		//A段
		m.suspend();
		System.out.println("A="+System.currentTimeMillis()+"i="+m.getI());
		Thread.sleep(3000);
		System.out.println("A="+System.currentTimeMillis()+"i="+m.getI());

		//B段
		m.resume();
		Thread.sleep(3000);
		//C段
		m.suspend();
		System.out.println("B="+System.currentTimeMillis()+"i="+m.getI());
		Thread.sleep(3000);
		System.out.println("B="+System.currentTimeMillis()+"i="+m.getI());
		
	}
	
//	@Test
	public void test9() throws InterruptedException{
		final SynchronizedObject so = new SynchronizedObject();
		Thread t = new Thread(){
			@Override
			public void run() {
				so.printString();
			}
		};
		t.setName("a");
		t.start();
		Thread.sleep(3000);
		Thread t1 = new Thread(){
			@Override
			public void run() {
				System.out.println("t1 线程进去了，但进不到printString方法");
				System.out.println("因为printString方法被a线程锁定并永远被supend暂停");
				so.printString();
			}
		};
		t1.start();
	}
	
//	@Test
	public void test10(){
		YieIdThread y = new YieIdThread();
		y.start();
	}
	
	
	@Test
	public void test11(){
		HasSelfPrivetaNum has = new HasSelfPrivetaNum();
		ThreadA a = new ThreadA(has);
		a.start();
		ThreadB b = new ThreadB(has);
		b.start();
		
	}
	
	
}
