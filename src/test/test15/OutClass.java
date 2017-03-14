package test.test15;

public class OutClass {

	static class InnerClass1{
		public  void method1(InnerClass2 class2){
			String threadName = Thread.currentThread().getName();
			synchronized (class2) {
				System.out.println(threadName+" 进入Class1 类中的method1 方法");
				for(int i = 0; i<10; i++){
					System.out.println(" i ="+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(threadName+" 离开Class1 类中的method1 方法");
			}
		}
		
		public synchronized void method2(){
			System.out.println(Thread.currentThread().getName()+" 进入Class1 类中的method2 方法");
			for (int j = 0; j <= 10; j++) {
				System.out.println(" j = "+j);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+" 离开Class1 类中的method2 方法");

		}
	}
	
	static class InnerClass2{
		public synchronized void method1(){
			System.out.println(Thread.currentThread().getName()+" 进入Class2 类中的method1 方法");
		for (int i = 0; i < 10; i++) {
			System.out.println(" k = "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" 离开Class2 类中的method1 方法");
		}
	}
	
}
