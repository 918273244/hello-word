package test.test8;

public class Service {

	public static void  print(Object stringParam) {
		try {
			synchronized (stringParam) {
				while(true){
					
					System.out.println(" threadName = "
							+ Thread.currentThread().getName());
					
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static  void printA() {
		try {
			synchronized (Service.class) {
				System.out.println("在 "
						+ System.currentTimeMillis() + "进入pringA方法 threadName = "
						+ Thread.currentThread().getName());

				Thread.sleep(2000);
				System.out.println("在 "
						+ System.currentTimeMillis() + "离开pringA方法 threadName = "
						+ Thread.currentThread().getName());
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static  void printB() {
		try {
			synchronized (Service.class) {
				
				System.out.println("在 "
						+ System.currentTimeMillis() + "进入printB方法 threadName = "
						+ Thread.currentThread().getName());
				
				Thread.sleep(2000);
				System.out.println("在 "
						+ System.currentTimeMillis() + "离开printB方法 threadName = "
						+ Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  synchronized void printC() {
		try {
			System.out.println("在 "
					+ System.currentTimeMillis() + "进入printC方法 threadName = "
					+ Thread.currentThread().getName());
			
			Thread.sleep(2000);
			System.out.println("在 "
					+ System.currentTimeMillis() + "离开printC方法 threadName = "
					+ Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
