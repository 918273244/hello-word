package communication.test2;

public class Test2 {

	public static void main(String[] args) {
		String lock = new String();
		System.out.println("syn 上面");
		try {
			synchronized (lock) {
				System.out.println("syn 第一行");

				lock.wait();

				System.out.println("wait 下的代码");
			}
			System.out.println("syn 下面的代码");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
